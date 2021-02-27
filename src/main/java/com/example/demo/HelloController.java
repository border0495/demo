package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class HelloController {

	@GetMapping("/api/start")
	public String start() {
		
		return "안녕하세요. 현재 서버 시간은 " +new Date() + "입니다. by 오기석\n";
	}
	
}
