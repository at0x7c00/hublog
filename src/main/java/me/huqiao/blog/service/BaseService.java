package me.huqiao.blog.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import me.huqiao.blog.repository.IBaseRepository;

@Service
public class BaseService<T,ID extends Serializable> implements IBaseService<T, ID> {

	@Autowired
	private IBaseRepository<T, ID> baseRepository;
	
	@Override
	public Page<T> find(T queryEntity, Pageable pageInfo) {
		//TODO how to query by params
		return baseRepository.findAll(pageInfo);
	}

	@Override
	public T getById(ID id) {
		return baseRepository.findOne(id);
	}

	@Override
	public void save(T entity) {
		baseRepository.save(entity);
	}

	@Override
	public void delete(T entity) {
		baseRepository.delete(entity);		
	}

	@Override
	public void delete(ID id) {
		baseRepository.delete(id);
	}

}
