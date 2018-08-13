package com.dodram_hebron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dodram_hebron.service.AdminService;

@Controller
public class ContactController {
	
	@Autowired
	private AdminService service;
	
	@RequestMapping(value="/sendQA")
	public void sendQA(@RequestParam String hidden,
						@RequestParam String name,
						@RequestParam String email,
						@RequestParam String tel,
						@RequestParam String title,
						@RequestParam String contents) {
		
		System.out.println(hidden);
		System.out.println(name);
		System.out.println(email);
		System.out.println(tel);
		System.out.println(title);
		System.out.println(contents);
		
		
	}
}
