package com.deepak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.deepak.entity.User;
import com.deepak.service.UserService;
@Controller
public class UserController {
	
	@Autowired
	private UserService us;
	
	@RequestMapping("/open")
	public String openPage() {
		return "regi";
	}
	
	@RequestMapping("/save")
	public String saveAndOpen(@ModelAttribute("user") User user, Model model) {
		us.saveData(user);
		long id=user.getId();
		User data = us.getDate(id);
		String city=data.getCity();
		String[] cities = us.cityArray(city);
		model.addAttribute("data", data);
		model.addAttribute("cities", cities);
		return "view";
	}
}
