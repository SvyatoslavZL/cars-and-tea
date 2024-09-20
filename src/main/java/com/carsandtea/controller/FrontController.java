package com.carsandtea.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class FrontController {

    @GetMapping(value = "/")
    public ModelAndView homePage() {
        return new ModelAndView("index");
    }

    @GetMapping(value = "/register")
    public ModelAndView registerPage() {
        return new ModelAndView("register");
    }

    @GetMapping(value = "/login")
    public ModelAndView loginPage() {
        return new ModelAndView("login");
    }

    @GetMapping(value = "/profile")
    public ModelAndView profilePage() {
        return new ModelAndView("profile");
    }

}
