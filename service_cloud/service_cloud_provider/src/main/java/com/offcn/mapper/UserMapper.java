package com.offcn.mapper;

import com.offcn.springcloud.entity.User;

import java.util.List;

public interface UserMapper {
	List<User> showUserList();

	User showUserById(Integer id);
}
