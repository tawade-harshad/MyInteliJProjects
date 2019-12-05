package com.training.controllers;

import com.training.DAO.UserDAO;
import com.training.beans.User;
import com.training.ifaces.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ManageUserController {

    @Autowired
    private ModelAndView mdlView;

    @Autowired
    private User user;

    @Autowired
    private UserRepository<User> userDAO;

    @RequestMapping(method = RequestMethod.GET, value = "/registerUser")
    public ModelAndView getUserDetails(){

        mdlView.addObject("command",user);
        mdlView.setViewName("register");
        return mdlView;
    }


    @RequestMapping(method = RequestMethod.POST, value = "/registerUser")
    public ModelAndView onRegister(@ModelAttribute("addUser") User user){

        try {
            int rowAdded = userDAO.addUser(user);
            if (rowAdded == 1) {
                mdlView.addObject("successMessage", "User Registered Successfully");
                mdlView.setViewName("index");
            }
        }
        catch(Exception e){
            System.out.println("Error Message : " + e.getMessage());
            mdlView.addObject("successMessage", "User Registration Failed !");
            mdlView.setViewName("index");
        }
        return mdlView;
    }


    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public ModelAndView onLogin(@ModelAttribute("validateUser") User user, Model model){
        model.addAttribute("command",user);
        try{
            boolean isValidUser = userDAO.validateUser(user);
//            System.out.println(checkUser);
//            model.addAttribute("successMessage","User Validated Successfully !!!");
            if (isValidUser){
                mdlView.addObject("majorHeading","Apollo Hospitals");
                mdlView.setViewName("menu");
            }
        }
        catch(EmptyResultDataAccessException e){
            model.addAttribute("successMessage","Invalid Credentials !");
            mdlView.addObject("majorHeading","Apollo Hospitals");
            mdlView.addObject("command",new User());
            mdlView.setViewName("index");
        }
        return mdlView;
    }
}
