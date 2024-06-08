package com.bankapp.html.controller;

import com.bankapp.html.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class Registercontroll {
	
	 private List<User> userList = new ArrayList<>();
	
	@GetMapping("/")
	public String bankpage1() {
		return "bankpage1";
	}

    @GetMapping("/registration")
    public String showForm(Model model) {
        model.addAttribute("userRegistration", new User());
        return "registration";
    }

    @PostMapping("/registration")
    public String registerUser(User userRegistration,Model model){
        if (!userRegistration.getPassword().equals(userRegistration.getConfirm_password())) {
           return "result2";
        }
        else {
        	if(userRegistration.getPassword().isEmpty()) {
            	return "result2";
            }
        	else {
        		userList.add(userRegistration);
        		System.out.println(userRegistration);
        		return "result";}}
        	}
    public List<User> getUserList() {
        return userList;
    }
  
    @GetMapping("/login1")
    public String showLoginForm() {
        return "login1";
    }
    @PostMapping("/login1")
    public String login(Model model,@RequestParam String username, @RequestParam String password) {
        for (User user : userList) {
            if (user.getFirstname().equals(username) && user.getPassword().equals(password)) {
            	 model.addAttribute("users", userList);
                 return "login";
            }
        }
        // Redirect back to the login form with an error message
        return "/result2";
    
    
    
    
}
    }

