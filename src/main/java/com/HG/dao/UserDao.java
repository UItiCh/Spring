package com.HG.dao;


import com.HG.pojo.User;

public interface UserDao {

	public User getUserByUsernameAndPassword(User user);
}
