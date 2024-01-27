package org.nissan.ims.common.controller;

import org.nissan.ims.common.model.User;
import org.nissan.ims.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8080"})
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/save")
	public void saveUserDetails(@RequestBody User user) {
		userService.saveUserDetails(user);
	}
}
