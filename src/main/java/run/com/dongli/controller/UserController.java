package run.com.dongli.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import run.com.dongli.service.UserServiceImpl;

 


@RestController
/* @RequestMapping("/user") */
public class UserController {

	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@RequestMapping("/getUserList")
	public Object getUserList() {
		return userServiceImpl.getUserList();
	}
}
