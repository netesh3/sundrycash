package com.wallet.sundrycash.restcontroller;

import com.wallet.sundrycash.domain.User;
import com.wallet.sundrycash.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@EnableAutoConfiguration
public class UserRestController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> users(){
        List users = userService.getUsers();
        return users;
    }

    @GetMapping("countusers")
    public List<Long> userCounts(){
        List counts = Collections.singletonList(userService.userCounts());
        for(var user = 0;user<counts.size();user++){
            System.out.println(user);
        }
        return counts;
    }

    @PostMapping("/registrations")
    public void userRegistrations(@RequestBody List<User> user){
        try {
            userService.registerUser(user);
        }catch (Exception e){
            System.out.println(e.getCause());
        }
    }
    @PostMapping("/deregistrations")
    public void userDeRegistrations(@RequestBody List<User> user){
        try {
            userService.deRegisterUser(user);
        }catch (Exception e){
            System.out.println(e.getCause());
        }
    }

}
