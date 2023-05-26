package com.HG.service.impl;

import com.HG.dao.UserDao;
import com.HG.pojo.User;
import com.HG.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public User getUserByUsernameAndPassword(User user) {
		// TODO Auto-generated method stub
		 //����dao�ķ���  ���в�ѯ
		return userDao.getUserByUsernameAndPassword(user);
	}

}
