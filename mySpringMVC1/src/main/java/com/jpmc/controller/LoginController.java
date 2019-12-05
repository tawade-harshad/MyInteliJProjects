package com.jpmc.controller;

import com.jpmc.model.Login;
import com.jpmc.model.User;
import com.jpmc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.portlet.ModelAndView;

import javax.servlet.http.*;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/urllogin", method = RequestMethod.GET) //This is the href link value mentioned in index.jsp
    public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mav = new ModelAndView("login"); //This is the model attribute value for the form, mentioned in login.jsp
        mav.addObject("login",new Login());

        return mav;
    }

    @RequestMapping(value = "/loginProcess",method = RequestMethod.POST)
    public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
    @ModelAttribute("login") Login login){
    ModelAndView mav = null;

    User user = userService.validateUser(login);

    if(user != null){
        mav = new ModelAndView("welcome");
        mav.addObject("firstname", user.getFirstname());
    }else{
        mav = new ModelAndView("login");
        mav.addObject("message","Username or Password is Wrong !");
    }

    return mav;
    }
}
