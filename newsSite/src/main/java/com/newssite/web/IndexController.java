package com.newssite.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @RequestMapping("/")
    private ModelAndView index(ModelAndView mav) {
        mav.setViewName("index");

        return mav;
    }
}