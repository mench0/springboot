package com.example.web.springboot.controller;

import com.example.web.springboot.service.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/user")
	public String userPage(Model model, Authentication authentication){
		UserDetails userDetails = (UserDetails) authentication.getPrincipal();
		model.addAttribute("user", userDetails);
		return "user";
	}

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

}