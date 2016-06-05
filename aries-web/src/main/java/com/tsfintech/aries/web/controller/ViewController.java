package com.tsfintech.aries.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {

    @RequestMapping(value = "/view/**", method = RequestMethod.GET)
    public ModelAndView forwardToView() {
        return new ModelAndView("/index.html");
    }

}