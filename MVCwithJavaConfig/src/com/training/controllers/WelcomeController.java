package com.training.controllers;

import com.training.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @Autowired
    private ModelAndView mdlView;

    @Autowired
    public User user;

    @RequestMapping({"/","/index"})
    public ModelAndView init(){
        mdlView.addObject("majorHeading","Apollo Hospitals");
        mdlView.addObject("command",user);
        mdlView.setViewName("index");
        return mdlView;
    }

}
