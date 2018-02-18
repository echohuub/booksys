package com.heqingbao.booksys.domain;

import com.heqingbao.booksys.po.TbBook;
import com.heqingbao.booksys.po.TbCategory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by heqingbao on 2018/2/18.
 */
public class DTOUtils {

    public static Category toCategory(TbCategory tbCategory) {
        Category category = new Category();
        category.setId(tbCategory.getId());
        category.setName(tbCategory.getName());
        category.setDesc(tbCategory.getCateDesc());
        return category;
    }

    public static TbCategory toTbCategory(Category category) {
        TbCategory tbCategory = new TbCategory();
        tbCategory.setId(category.getId());
        tbCategory.setName(category.getName());
        tbCategory.setCateDesc(category.getDesc());
        return tbCategory;
    }

    public static List<Category> toCategories(List<TbCategory> tbCategories) {
        List<Category> categories = new ArrayList<>();
        for (TbCategory tbCategory : tbCategories) {
            Category c = toCategory(tbCategory);
            categories.add(c);
        }
        return categories;
    }

    public static Book toBook(TbBook tbBook) {
        Book book = new Book();
        book.setId(tbBook.getId());
        book.setName(tbBook.getName());
        book.setAmount(tbBook.getAmount());
        book.setPrice(tbBook.getPrice());
        book.setAuthor(tbBook.getAuthor());
        book.setPubHouse(tbBook.getPubHouse());
        return book;
    }

    public static TbBook toTbBook(Book book) {
        TbBook tbBook = new TbBook();
        tbBook.setId(book.getId());
        tbBook.setName(book.getName());
        tbBook.setAmount(book.getAmount());
        tbBook.setPrice(book.getPrice());
        tbBook.setAuthor(book.getAuthor());
        tbBook.setPubHouse(book.getPubHouse());
        return tbBook;
    }

    public static List<Book> toBooks(List<TbBook> tbBooks) {
        List<Book> books = new ArrayList<>();
        for (TbBook tbBook : tbBooks) {
            Book book = toBook(tbBook);
            books.add(book);
        }
        return books;
    }


}
