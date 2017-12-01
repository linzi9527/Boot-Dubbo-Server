package com.boot.dubbo.server.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.boot.dubbo.server.api.UserService;
import com.boot.dubbo.server.model.User;
import com.summaryday.framework.d.IBaseDao;

public class UserServiceImpl implements UserService {

	private Logger log=Logger.getLogger(UserServiceImpl.class);
	
	@Resource
	private IBaseDao baseDao;
	
	public User getUserById(String id) throws Exception {
		//baseDao=SpringBeanHelper.getBean("baseDao");
		log.info("=========baseDao:"+baseDao);
		//return (User) baseService.get(id, User.class, false);
		return (User) baseDao.get(id, User.class, false);
	}

	public boolean login(User user) throws Exception {
		// TODO Auto-generated method stub
		return baseDao.save(user);
	}

}
