package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Foods;
import com.example.demo.service.FoodsService;

@Controller
public class FoodsController {
	@Autowired
	FoodsService serve;
	
	@GetMapping("index")
	public String dexView() {
		return "index";
	}
	@PostMapping("dbselect")
	public String listView(Model model) {
		Iterable<Foods> list =serve.findAll();
		model.addAttribute("dead", list);
		return "list";
	}
	
}
