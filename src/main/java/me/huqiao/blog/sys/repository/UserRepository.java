package me.huqiao.blog.sys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.huqiao.blog.sys.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	 User findByEmail(String email);
}