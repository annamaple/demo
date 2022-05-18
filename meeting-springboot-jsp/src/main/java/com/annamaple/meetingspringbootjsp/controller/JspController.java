package com.annamaple.meetingspringbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedList;
import java.util.List;


/**
 * 有关JSP的从Controller
 *
 * @author lei
 */
@Controller
@RequestMapping("/jsp")
public class JspController {


    @RequestMapping("/1")
    public String jsp1(ModelMap map) {
        map.put("name", "annamaple");
        map.put("age", 24);
        return "jsp1";
    }

    @RequestMapping("/2")
    public String jsp2(ModelMap map) {
        map.put("name", "anna");
        map.put("age", 25);
        List<String> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add("hobby_" + String.format("%02d", i));
        }
        map.put("list", list);
        return "jsp2_list";
    }
}
