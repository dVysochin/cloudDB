package com.den.cloud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(value = "/*", method = RequestMethod.GET)
    public ModelAndView getHome() {

        ModelAndView mv = new ModelAndView("home");
        return mv;
    }
}
