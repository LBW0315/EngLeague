package com.example.EngLeague.controller;





import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String index(Model model, @PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.ASC) Pageable pageable) {	
        Page<Word> wordPage = wordRepository.findAll(pageable);
                
        model.addAttribute("wordPage", wordPage);
        
        return "admin/word/index";
    }  

	

}
