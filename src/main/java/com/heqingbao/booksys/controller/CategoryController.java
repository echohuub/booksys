package com.heqingbao.booksys.controller;

import com.heqingbao.booksys.domain.Category;
import com.heqingbao.booksys.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class CategoryController extends BaseController {

    @Autowired
    private BookService bookService;

    @ResponseBody
    @RequestMapping(value = "/addCategory", method = RequestMethod.POST)
    public Object add(Category category) {
        int id = bookService.addCategory(category);
        Map<String, Integer> map = new HashMap<>();
        map.put("status", id);
        return map;
    }

    @ResponseBody
    @PostMapping(value = "/updateCategory")
    public Object update(Category category) {
        bookService.updateCategory(category);
        Map<String, Integer> map = new HashMap<>();
        map.put("status", 1);
        return map;
    }

    @ResponseBody
    @GetMapping(value = "/getAllCategories")
    public Object getAll() {
        return bookService.getAllCategories();
    }
}
