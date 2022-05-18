package com.annamaple.meetspringboot.controller;

import com.annamaple.meetspringboot.controller.dto.ResultDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * AnnamapleController restApi
 * @author lei
 *
 */
@RestController
@RequestMapping("/annamaple")
public class AnnamapleController {


	@RequestMapping("/hello")
	public ResultDTO<String> hello() {
		return ResultDTO.success("Hello, World");
	}
	
}
