package com.questionbank.controllers;

import java.security.Principal;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class mainController {
	
	
	@RequestMapping(value = {"/","/index"}, method = RequestMethod.GET)
    public String welcomePage(Model model) {
        model.addAttribute("title", "Welcome");
        model.addAttribute("message", "This is welcome page to CMPT-350 Project!");
        return "index";
    }
	
    
    
    
}
