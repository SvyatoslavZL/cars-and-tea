package com.carsandtea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontController {

    @GetMapping(value = "/")
    public ModelAndView showPage() {
        return new ModelAndView("index");
    }

}
