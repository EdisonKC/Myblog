package com.edison.myblog.controller.admin;

import com.edison.myblog.model.UserDomain;
import com.edison.myblog.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping("/admin")
public class AuthorController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/login")
    public String login() {
        return "admin/login";
    }

    @PostMapping(value = "/login")
    @ResponseBody
    public String to_login(
            HttpServletRequest request,
            HttpServletResponse response,
            @RequestParam(name = "username", required = true)
                    String username,
            @RequestParam(name = "password", required = true)
                    String password,
            @RequestParam(name = "remember_me", required = false)
                    String remember_me
    ) {
        UserDomain userInfo = userService.login(username, password);
        if (userInfo.getUsername().equals(username)&&userInfo.getPassword().equals(password)) {
            return "success!";
        }
        else {
            return "faile!";
        }
    }
}
