package com.heqingbao.booksys.service.impl;

import com.heqingbao.booksys.domain.*;
import com.heqingbao.booksys.mapper.TbBookMapper;
import com.heqingbao.booksys.mapper.TbCategoryMapper;
import com.heqingbao.booksys.po.TbBook;
import com.heqingbao.booksys.po.TbBookExample;
import com.heqingbao.booksys.po.TbCategory;
import com.heqingbao.booksys.po.TbCategoryExample;
import com.heqingbao.booksys.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by heqingbao on 2018/2/18.
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private TbCategoryMapper categoryMapper;

    @Autowired
    private TbBookMapper bookMapper;

    @Override
    public Integer addCategory(Category category) {
        TbCategory tbCategory = DTOUtils.toTbCategory(category);
        categoryMapper.insert(tbCategory);
        return 1;
    }

    @Override
    public Integer addBook(Book book, Integer categoryId) {
        TbBook tbBook = DTOUtils.toTbBook(book);
        tbBook.setCateId(categoryId);
        bookMapper.insert(tbBook);
        return 1;
    }

    @Override
    public List<Category> getAllCategories() {
        TbCategoryExample example = new TbCategoryExample();
        List<TbCategory> tbCategories = categoryMapper.selectByExample(example);
        return DTOUtils.toCategories(tbCategories);
    }

    @Override
    public List<Book> getAllBooks() {
        TbBookExample example = new TbBookExample();
        List<TbBook> tbBooks = bookMapper.selectByExample(example);
        List<Book> books = DTOUtils.toBooks(tbBooks);
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            TbCategory tbCategory = categoryMapper.selectByPrimaryKey(tbBooks.get(i).getCateId());
            book.setCategory(DTOUtils.toCategory(tbCategory));
        }
        return books;
    }

    @Override
    public Integer addInventory(Inventory inventory, int[] amounts, Integer[] bookIds) {
        return null;
    }

    @Override
    public Integer saleBook(Sale sale, Integer bookId) {
        return null;
    }

    @Override
    public List<Inventory> getAllInventories() {
        return null;
    }

    @Override
    public List<Sale> getAllSales() {
        return null;
    }

    @Override
    public Object getItemsByInventoryId(Integer inventoryId) {
        return null;
    }

    @Override
    public void updateCategory(Category category) {
        TbCategory tbCategory = DTOUtils.toTbCategory(category);
        TbCategoryExample example = new TbCategoryExample();
        categoryMapper.updateByPrimaryKey(tbCategory);
    }

    @Override
    public void updateBook(Book book, Integer categoryId) {
        TbBook tbBook = DTOUtils.toTbBook(book);
        tbBook.setCateId(categoryId);

        bookMapper.updateByPrimaryKey(tbBook);
    }
}
