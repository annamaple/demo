package com.annamaple.meetspringboot.controller;

import cn.hutool.core.lang.Console;
import com.annamaple.meetspringboot.controller.dto.ResultDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;


/**
 * AnnamapleController restApi
 * @author lei
 *
 */
@RestController
@RequestMapping("/annamaple")
public class AnnamapleController {


	@RequestMapping("/hello")
	public ResultDTO<String> hello(HttpServletRequest request) {
		String header1 = request.getHeader("1");
		String header2 = request.getHeader("2");
		String header3 = request.getHeader("3");
		Console.log("head: {}, {}, {}", header1, header2, header3);
		try(BufferedReader reader = request.getReader()) {
			String str;
			StringBuilder sb = new StringBuilder("");
			while ((str = reader.readLine()) != null) {
				sb.append(str);
			}
			Console.log("body: {}", sb);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ResultDTO.success("Hello, World");
	}
	
}
