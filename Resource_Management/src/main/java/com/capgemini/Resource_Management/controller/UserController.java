package com.capgemini.Resource_Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Resource_Management.model.Page;
import com.capgemini.Resource_Management.model.UserRegistration;
import com.capgemini.Resource_Management.service.PageService;
import com.capgemini.Resource_Management.service.UserService;
import com.capgemini.Resource_Management.status.Response;

@CrossOrigin(origins = {"http://localhost:8085"}, maxAge = 4800, allowCredentials = "false")
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	PageService pageService;

	@PostMapping("/register")
	public Response saveUser(@RequestBody UserRegistration userRegistration) {
		try {
			userService.register(userRegistration);
			return new Response(1, " User Registered Successfully");
		} catch (Exception exception) {
			// return new ResponseEntity<>("please enter correct data",
			// HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new Response(1, " User Registered Successfully");
	}

	@GetMapping("/getUser")
	public ResponseEntity<List<UserRegistration>> getAllUser() {
		try {
			List<UserRegistration> userRegistrations = userService.getAllUser();
			return new ResponseEntity<>(userRegistrations, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@CrossOrigin(origins="*")
	@PostMapping("/login")
	public Response login(@RequestBody UserRegistration userRegistration) throws Exception {
		UserRegistration userRegistration2 = userService.getUser(userRegistration.getUserid());
		try {
			if (userRegistration2 != null && authenticate(userRegistration, userRegistration2)) {
				
				List<Page> pages =  pageService.getPageList();

				return new Response(1, "User logged in Successfully !",pages);
			}
		} catch (Exception e) {
			System.out.println("Inside Exception");
			e.printStackTrace();
		}
		return new Response(0, "Please enter correct credentials");

	}

	private boolean authenticate(UserRegistration formUser, UserRegistration dbUser) {
		if (formUser.getUserid().equals(dbUser.getUserid())
				&& formUser.getPassword().equals(dbUser.getPassword())) {
			return true;
		} else {
			return false;
		}

	}
}
