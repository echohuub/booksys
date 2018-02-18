package com.heqingbao.booksys.controller;

import com.heqingbao.booksys.domain.Book;
import com.heqingbao.booksys.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class BookController extends BaseController {
    @RequestMapping(value = "/{formName}", method = RequestMethod.GET)
    public String common(@PathVariable String formName) {
        // 动态跳转页面
        return formName;
    }

	@Autowired
	private BookService bookService;

    @ResponseBody
    @RequestMapping(value = "/addBook", method = RequestMethod.POST)
    public Object add(@ModelAttribute Book book, Integer categoryId) {
		bookService.addBook(book, categoryId);
		Map<String, Integer> map = new HashMap<>();
		map.put("status", 1);
		return map;
    }

    @ResponseBody
    @PostMapping(value = "/updateBook")
    public Object update(@ModelAttribute Book book, Integer categoryId) {
		bookService.updateBook(book, categoryId);
		Map<String, Integer> map = new HashMap<>();
		map.put("status", 1);
		return map;
    }

    @ResponseBody
    @GetMapping(value = "/getAllBooks")
    public Object getAll() {
		return bookService.getAllBooks();
    }
}
