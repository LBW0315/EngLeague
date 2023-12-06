package com.example.EngLeague.controller;


import java.util.List;

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
	public String index(Model model) {
		List<Word> word = wordRepository.findAll();
		
		model.addAttribute("word",word);
		
		return "admin/word/index";
	}
	

}
