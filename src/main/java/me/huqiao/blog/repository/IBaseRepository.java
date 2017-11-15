package me.huqiao.blog.repository;

import java.io.Serializable;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface IBaseRepository<T,ID extends Serializable> extends PagingAndSortingRepository<T, ID>{

}
