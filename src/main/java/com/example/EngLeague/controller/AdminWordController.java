package com.example.EngLeague.controller;





import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.EngLeague.entity.Word;
import com.example.EngLeague.repository.WordRepository;



@Controller
@RequestMapping("/admin/word")
public class AdminWordController {
	private final WordRepository wordRepository;
	
	public AdminWordController(WordRepository wordRepository) {
		this.wordRepository = wordRepository;
	}
	
	
	@GetMapping
	public String index(Model model, @PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.ASC) Pageable pageable, @RequestParam(name = "unit", required = false)String unit) {	
        Page<Word> wordPage;
        
        
        if(unit != null && !unit.isEmpty()) {
        	wordPage = wordRepository.findByUnitLike("%" + unit + "%", pageable);
        }else {
        	wordPage = wordRepository.findAll(pageable);
        }
                
        model.addAttribute("wordPage", wordPage);
        model.addAttribute("unit", unit);
        
        return "admin/word/index";
    }  

	

}
