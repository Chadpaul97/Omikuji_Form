package com.codingdojo.Omikuji_Form.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class OmikujiController {
	@RequestMapping("/Omikuji")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/send", method=RequestMethod.POST)
	public String send( HttpSession session,
			@RequestParam(value="number") String number,
			@RequestParam(value="city") String city,
			@RequestParam(value="person") String person,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="livingthing") String livingthing,
			@RequestParam(value="comment") String comment) {
		
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("livingthing", livingthing);
		session.setAttribute("comment", comment);
		
		return "redirect:/Omikuji/show";
	}
	
	@RequestMapping("/Omikuji/show")
	public String show(HttpSession session, Model model) {
		model.addAttribute("number", session.getAttribute("number")
);
		model.addAttribute("city",session.getAttribute("city")
);
		model.addAttribute("person",session.getAttribute("person"));
		model.addAttribute("hobby",session.getAttribute("hobby"));
		model.addAttribute("livingthing",session.getAttribute("livingthing"));
		model.addAttribute("comment",session.getAttribute("comment"));
		return "show.jsp";
	}
}
