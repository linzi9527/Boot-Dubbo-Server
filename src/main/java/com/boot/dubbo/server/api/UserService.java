package com.boot.dubbo.server.api;

import com.boot.dubbo.server.model.User;


public interface UserService {

	public User getUserById(String id) throws Exception;
	public boolean login(User user) throws Exception; 
}
