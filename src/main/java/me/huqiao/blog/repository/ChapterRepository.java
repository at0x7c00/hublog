package me.huqiao.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.huqiao.blog.entity.Chapter;

public interface ChapterRepository extends JpaRepository<Chapter, Long>{

}
