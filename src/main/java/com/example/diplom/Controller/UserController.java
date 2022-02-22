package com.example.diplom.Controller;

import com.example.diplom.models.UsersModel;
import com.example.diplom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "register";
    }


    @GetMapping("/register")
    public String getRegisterPage(Model model){
        model.addAttribute("registerRequest", new UsersModel());
        return "register";

    }

    @GetMapping("/login")
    public String getLoginPage(Model model){
        model.addAttribute("loginRequest", new UsersModel());
        return "login_page";

    }

    @PostMapping("/register")
    public String register(@ModelAttribute UsersModel usersModel){

        UsersModel registeredUser=userService.registerUser(usersModel.getLogin(), usersModel.getPassword());
        System.out.println("register request " + usersModel + usersModel.getLogin()+ usersModel.getPassword());
       return registeredUser==null? "error_page" : "redirect:/login";
    }

//    @PostMapping("/login")
//    public String login(@ModelAttribute UsersModel usersModel){
//
//        UsersModel authenticated=userService.authenticate(usersModel.getLogin(), usersModel.getPassword());
//        System.out.println("login request " + usersModel + usersModel.getLogin()+ usersModel.getPassword());
//        return authenticated==null? "error_page" : "redirect:/home";
//    }

    @PostMapping("/login")
    public String login(@ModelAttribute UsersModel usersModel, Model model){
        System.out.println("login request " + usersModel);
        UsersModel authenticated=userService.authenticate(usersModel.getLogin(), usersModel.getPassword());
        if(authenticated!=null) {
            model.addAttribute("userLogin", authenticated.getLogin());
            return "home";
        }else{
            return "error_page";
        }

    }


}

