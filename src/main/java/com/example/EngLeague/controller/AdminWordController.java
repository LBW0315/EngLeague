package com.example.EngLeague.controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.EngLeague.entity.Word;
import com.example.EngLeague.repository.WordRepository;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/admin/word")
public class AdminWordController {
	private final WordRepository wordRepository;
	
	public AdminWordController(WordRepository wordRepository) {
		this.wordRepository = wordRepository;
	}
	
	@Autowired
	@GetMapping
	public String index(Model model) {
		List<Word> word = wordRepository.findAll();
		
		model.addAttribute("wd",word);
		
		return "admin/word/index";
	}
	

}
