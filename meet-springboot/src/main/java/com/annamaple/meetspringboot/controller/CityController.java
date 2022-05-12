package com.annamaple.meetspringboot.controller;

import com.annamaple.meetspringboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xionglei
 * @create 2022-05-12 15:56
 */
@Controller
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/cities")
    public String findAll(Model model) {
        model.addAttribute("cities", cityService.findAll());
        return "cities";
    }

    @RequestMapping("/add/{name}/{address}")
    public String add(@PathVariable("name") String name, @PathVariable("address") String address, Model model) {
        int id = cityService.add(name, address);
        model.addAttribute("id", id);
        return "success";
    }
}
