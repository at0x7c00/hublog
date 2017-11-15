package me.huqiao.blog.service;

import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBaseService<T,ID extends Serializable>{

	public Page<T> find(T queryEntity,Pageable pageInfo);
	public T getById(ID id);
	public void save(T entity);
	public void delete(T entity);
	public void delete(ID id);
}
