package me.huqiao.blog.sys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.huqiao.blog.sys.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	Role findByRole(String role);
}