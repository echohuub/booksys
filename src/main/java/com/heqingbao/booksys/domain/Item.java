package com.heqingbao.booksys.domain;

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2018, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class Item
{
	// 标识属性
	private Integer id;
	// 该入库项对应图书的数量g
	private int amount;
	// 该入库项所属的入库单
	private Inventory inventory;
	// 该入库项对应的图书
	private Book book;
	// 标志属性的getter、setter方法
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	// amount成员变量的getter、setter方法
	public int getAmount()
	{
		return amount;
	}
	public void setAmount(int amount)
	{
		this.amount = amount;
	}
	// inventory成员变量的getter、setter方法
	public Inventory getInventory()
	{
		return inventory;
	}
	public void setInventory(Inventory inventory)
	{
		this.inventory = inventory;
	}
	// book成员变量的getter、setter方法
	public Book getBook()
	{
		return book;
	}
	public void setBook(Book book)
	{
		this.book = book;
	}
}
