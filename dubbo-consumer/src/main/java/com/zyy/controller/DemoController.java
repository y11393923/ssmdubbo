package com.zyy.controller;

import com.zyy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
    @Autowired
	private UserService userService;

	@RequestMapping("/test")
    @ResponseBody
    public Object test(){
        return userService.findAll();
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
