package com.capgemini.Resource_Management.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.Resource_Management.model.UserRegistration;
import com.capgemini.Resource_Management.repository.UserRepository;
import com.capgemini.Resource_Management.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public void register(UserRegistration registration) {

		userRepository.save(registration);

	}

	@Override
	public List<UserRegistration> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public UserRegistration getUser(String user_id) {
		return userRepository.getUserByUser_id(user_id);
	}

}
