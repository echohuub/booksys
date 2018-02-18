package com.heqingbao.booksys.controller;

import com.heqingbao.booksys.exception.BookException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

public class BaseController {

    @ExceptionHandler(BookException.class)
    @ResponseBody
    public Object exp(Exception ex) {
        // 将捕捉到的BookException转换成Map传给前端jQuery
        Map<String, String> map = new HashMap<>();
        map.put("exception", ex.getMessage());
        return map;
    }
}