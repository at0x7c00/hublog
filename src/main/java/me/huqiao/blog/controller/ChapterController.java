package me.huqiao.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import me.huqiao.blog.entity.Chapter;
import me.huqiao.blog.service.IChapterService;

@RestController
@RequestMapping("/chapter")
public class ChapterController {
	
	@Autowired
	private IChapterService chapterService;
	
	@GetMapping("/list")
	public Page<Chapter> list(Chapter chapter,@RequestParam int page,@RequestParam int size){
		PageRequest pageRequest = new PageRequest(page,size,new Sort("id"));
		return chapterService.find(chapter, pageRequest);
	}
	
	@GetMapping("/view/{id}")
	public Chapter view(@PathVariable("id")Long id) {
		return chapterService.getById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id")Long id) {
		chapterService.delete(id);
		return "OK";
	}

	@PostMapping("/add")
	public String add(@ModelAttribute Chapter chapter) {
		chapterService.save(chapter);
		return "OK";
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute Chapter chapter) {
		chapterService.save(chapter);
		return "OK";
	}
}
