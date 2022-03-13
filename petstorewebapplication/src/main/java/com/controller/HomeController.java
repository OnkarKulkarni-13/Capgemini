package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")

	public String view(Model model) {
		System.out.println("This is a HomeController");
		model.addAttribute("name", "Onkar Sudhir Kulkarni");
		model.addAttribute("id", 50);

		List<String> friends = new ArrayList<String>();
		friends.add("Onkar");
		friends.add("Ram");
		friends.add("Sham");
		model.addAttribute("f", friends);
		return "/index";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help in HomeController");
		ModelAndView mvc = new ModelAndView("/help");
		mvc.addObject("name", "Sarvesh Kulkarni");
		mvc.addObject("id", 101);

		List<String> cities = new ArrayList<String>();
		cities.add("Jalna");
		cities.add("Aurangabad");
		cities.add("Nashik");
		mvc.addObject("city", cities);
		return mvc;

	}

	@RequestMapping("/contact")
	public String showForm() {
		return "/contact";
	}

	/*
	 * public ModelAndView getIndex() { ModelAndView mymv = new
	 * ModelAndView("/index"); return mymv; }
	 */
}
