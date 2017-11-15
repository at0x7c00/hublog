package me.huqiao.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.huqiao.blog.entity.Chapter;
import me.huqiao.blog.repository.ChapterRepository;

@RestController
@RequestMapping("/chapter")
public class ChapterController {
	
	@Autowired
	private ChapterRepository chapterRepository;
	
	@GetMapping("/list")
	public List<Chapter> list(){
		return chapterRepository.findAll();
	}
	
	@GetMapping("/view/{id}")
	public Chapter view(@PathVariable("id")Long id) {
		return chapterRepository.findOne(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id")Long id) {
		chapterRepository.delete(id);
		return "OK";
	}

	@PostMapping("/add")
	public String add(@ModelAttribute Chapter chapter) {
		chapterRepository.save(chapter);
		return "OK";
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute Chapter chapter) {
		chapterRepository.save(chapter);
		return "OK";
	}
}
