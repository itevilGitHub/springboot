package com.sinosoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/test")
public class HelloSpringbootController {
	
	@RequestMapping("/map")
    public String hello() {
		
        return "map";
    }
	
	@RequestMapping("/index")
	public String indexShow(){
		return "index";
	}
	
	@RequestMapping("/upload")
	public String uploadShow(){
		return "fileUploadAndDown";
	}
}
