package com.dev.springthymeleafsecurity.controller;

import com.dev.springthymeleafsecurity.dto.UserDto;
import com.dev.springthymeleafsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/registration")
public class UserController {
    @Autowired
    private UserService userService;

    //provides the user object, stored in userDto object
//    @ModelAttribute("user")
//    public UserDto userDto(){
//        return new UserDto();
//    }

//    @GetMapping
//    public String showRegistrationForm(){
//        return "registration";
//    }

    @GetMapping
    public String showRegistrationForm(Model model){
        model.addAttribute("user", new UserDto());
        return "registration";
    }

    @PostMapping
    public String save(@ModelAttribute("user")UserDto userDto){
        userService.save(userDto);
        return "redirect:/registration?success";
    }
}
