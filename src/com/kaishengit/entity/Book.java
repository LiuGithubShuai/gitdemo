package com.kaishengit.entity;

public class Book {
	
	private Integer id;
	private String bookname;
	private String author;
	private Integer totalnum;
	private Integer nownum;
	private String isbn;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getTotalnum() {
		return totalnum;
	}
	public void setTotalnum(Integer totalnum) {
		this.totalnum = totalnum;
	}
	public Integer getNownum() {
		return nownum;
	}
	public void setNownum(Integer nownum) {
		this.nownum = nownum;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	

}
