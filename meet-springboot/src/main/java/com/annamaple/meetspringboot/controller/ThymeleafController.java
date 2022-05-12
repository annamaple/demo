package com.annamaple.meetspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * thymeleaf模板引擎
 *
 * @author xionglei
 */
@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @GetMapping("/map")
    public String list(Model model) {
        // 这个map在springmvc Context里
        model.addAttribute("k1", "v1");
        model.addAttribute("k2", "v2");
        model.addAttribute("k3", "v3");
        model.addAttribute("k4", "v4");
        model.addAttribute("name", "annamaple");
        Map<String, String> map = new HashMap<>();
        map.put("name", "iu");
        map.put("age", "30");
        model.addAttribute("map", map);
        List<String> list = new LinkedList<>();
        list.add("play");
        list.add("photography");
        list.add("music");
        model.addAttribute("list", list);
        
        List<Map<String, String>> users = new LinkedList<>();
        users.add(map);
        users.add(map);
        users.add(map);
        model.addAttribute("users", users);
        return "thymeleaf";
    }
}
