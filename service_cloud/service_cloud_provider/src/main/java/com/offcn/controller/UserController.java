package com.offcn.controller;

import com.offcn.service.UserService;
import com.offcn.springcloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/showList")
	public List<User> showUserList(){
		List<User> users = userService.showUserList();
		return users;
	}

	@GetMapping("/showUser/{id}")
	public User showUserById(@PathVariable("id") Integer id){
		User user = userService.showUserById(id);
		return user;
	}
}
