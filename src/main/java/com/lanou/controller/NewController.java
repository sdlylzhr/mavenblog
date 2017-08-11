package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewController {
	
	@RequestMapping(value="/testpage")
	public String testMVC(){
		
		return "index";
	}
}
