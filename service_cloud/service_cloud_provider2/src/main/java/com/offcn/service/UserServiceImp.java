package com.offcn.service;

import com.offcn.mapper.UserMapper;
import com.offcn.springcloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> showUserList() {
		List<User> users = userMapper.showUserList();
		return users;
	}

	@Override
	public User showUserById(Integer id) {
		User user = userMapper.showUserById(id);
		return user;
	}
}
