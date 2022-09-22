package com.annamaple.meetspringboot.controller;

import cn.hutool.json.JSONObject;
import com.annamaple.meetspringboot.controller.dto.ResultDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

/**
 * @author xionglei
 * @create 2022-06-06 11:05
 */
@Controller
@RequestMapping("/city/bt/v1")
public class BtCityController {


    @GetMapping("/")
    public String city() {
        return "bts/city";
    }
    
    
    @PostMapping("/map")
    @ResponseBody
    public ResultDTO<?> acceptMap(@RequestBody Map<String, String> map) {
        map.put("date", LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE));
        return ResultDTO.success(map);
    }

    @PostMapping("/json")
    @ResponseBody
    public ResultDTO<?> acceptJson(@RequestBody JSONObject json) {
        json.set("date", LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE));
        return ResultDTO.success(json);
    }
}
