package run.com.dongli.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/* @EnableAutoConfiguration */
public class TestHelloController {

	@RequestMapping("/hello")
	public String test() {
		return "hello test !";
	}
}
