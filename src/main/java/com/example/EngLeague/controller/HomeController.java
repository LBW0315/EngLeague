package com.example.EngLeague.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//ホーム画面
@Controller
public class HomeController {
	@GetMapping("/")
    public String index() {
        return "index";
    }   
}


