package com.annamaple.meetspringboot.controller;

import com.annamaple.meetspringboot.service.CityService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * City相关Controller
 *
 * @author xionglei
 * @create 2022-05-12 15:56
 */
@Controller
@RequestMapping("/city")
public class CityController {

    private final CityService cityService;

    public CityController(@Qualifier("persistenceCityServiceImpl") CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/cities")
    public String findAll(Model model) {
        model.addAttribute("cities", cityService.findAll());
        return "cities";
    }

    @RequestMapping("/add")
    public String add(@RequestParam("name") String name, @RequestParam("address") String address, Model model) {
        int id = cityService.add(name, address);
        model.addAttribute("id", id);
        model.addAttribute("stat", id);
        return "city_add";
    }

    @GetMapping("/add-page")
    public String addPage(Model model) {
        model.addAttribute("stat", 0);
        return "city_add";
    }
    
    @GetMapping("")
    public String page(Model model) {
        return addPage(model);
    }

}
