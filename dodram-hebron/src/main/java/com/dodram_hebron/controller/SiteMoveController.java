package com.dodram_hebron.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SiteMoveController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception {
		return "index";
	}
	
	@RequestMapping(value = "/dodram")
	public String dodram_home(Locale locale, Model model) throws Exception {
		return "/dodram/index";
	}
	
	@RequestMapping(value = "/hebron")
	public String hebron_home(Locale locale, Model model) throws Exception {
		return "/hebron/index";
	}
}