package com.heqingbao.booksys.controller;

import com.heqingbao.booksys.domain.Sale;
import com.heqingbao.booksys.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SaleController extends BaseController {
    @Autowired
    private BookService bookService;

    @ResponseBody
    @GetMapping(value = "/getAllSales")
    public Object getAll() {
        return bookService.getAllSales();
    }

    @ResponseBody
    @PostMapping(value = "/saleBook")
    public Object add(@ModelAttribute Sale sale, Integer bookId) {
        Integer id = bookService.saleBook(sale, bookId);
        Map<String, Integer> map = new HashMap<>();
        map.put("status", id);
        return map;
    }
}
