package com.heqingbao.booksys.controller;

import com.heqingbao.booksys.domain.Inventory;
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
public class InventoryController extends BaseController {
    @Autowired
    private BookService bookService;

    @ResponseBody
    @GetMapping(value = "/getAllInventories")
    public Object getAll() {
        return bookService.getAllInventories();
    }

    @ResponseBody
    @GetMapping(value = "/getItemsById")
    public Object getItemsById(Integer inventoryId) {
        return bookService.getItemsByInventoryId(inventoryId);
    }

    @ResponseBody
    @PostMapping(value = "/addInventory")
    public Object add(@ModelAttribute Inventory inventory,
                      int[] amounts, Integer[] bookIds) {
        Integer id = bookService.addInventory(inventory,
                amounts, bookIds);
        Map<String, Integer> map = new HashMap<>();
        map.put("status", id);
        return map;
    }
}
