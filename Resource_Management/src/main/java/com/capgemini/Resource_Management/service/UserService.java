package com.capgemini.Resource_Management.service;



import java.util.List;

import com.capgemini.Resource_Management.model.UserRegistration;
//@Service(name="UserService")
public interface UserService {
	
	
	public void register(UserRegistration registration);
	
	public List<UserRegistration> getAllUser();
	
	public UserRegistration getUser(String user_id);

}
