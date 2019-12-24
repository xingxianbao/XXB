package cn.edu.aynu.rjxy.management.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("login")
public class LoginController {


    @RequestMapping("getName")
    public Map getName(){
        Map<String,String> map = new HashMap();
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        map.put("name",name);
        return  map;
    }
}

