package com.sumon.xyz.Thymeleaf.Template;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/if-unless")
    public String users(Model model)
    {
        List<User> users = new ArrayList<>();
        users.add(new User("Sumon","sumonsarder.cse@gmail.com","ADMIN"));
        users.add(new User("Tom","sumonsarder.cse@gmail.com","USER"));
        users.add(new User("Johan","sumonsarder.cse@gmail.com","USER"));
        model.addAttribute("users",users);
        return "if-unless";

    }


    @GetMapping("/switch-case")
    public String switchExample(Model model)
    {
        User user = new User("Sumon","sumonsarder.cse@gmail.com","ADMIN");
        model.addAttribute("user",user);
        return "switch-case";

    }
}
