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
public class Sale
{
	// 标识属性
	private Integer id;
	// 销售数量
	private int amount;
	// 打折
	private double discount;
	// 销售总价
	private double totalPrice;
	// 销售人
	private String operator;
	// 销售的图书
	private Book book;
	// 标识属性的getter、setter方法
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
	// discount成员变量的getter、setter方法
	public double getDiscount()
	{
		return discount;
	}
	public void setDiscount(double discount)
	{
		this.discount = discount;
	}
	// totalPrice成员变量的getter、setter方法
	public double getTotalPrice()
	{
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice)
	{
		this.totalPrice = totalPrice;
	}
	// operator成员变量的getter、setter方法
	public String getOperator()
	{
		return operator;
	}
	public void setOperator(String operator)
	{
		this.operator = operator;
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
