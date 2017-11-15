package me.huqiao.blog.sys.service;

import me.huqiao.blog.sys.entity.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}