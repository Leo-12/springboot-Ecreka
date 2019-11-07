package com.offcn.service;

import com.offcn.springcloud.entity.User;

import java.util.List;

public interface UserService {

	List<User> showUserList();

	User showUserById(Integer id);
}
