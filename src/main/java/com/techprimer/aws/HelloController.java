package com.techprimer.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping("youtube")
	public String sayHelloYouTube() {
		return "Hello You Tube - V1.0";
	}

}
   