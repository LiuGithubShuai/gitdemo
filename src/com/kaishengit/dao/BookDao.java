package com.kaishengit.dao;

import org.apache.commons.dbutils.handlers.BeanHandler;

import com.kaishengit.entity.Book;
import com.kaishengit.util.DbHelp;

public class BookDao {
	
	public void addBook(Book book){
		String sql = "insert into t_book (bookname,author,totalnum,nownum,isbn) values (?,?,?,?,?)";
		DbHelp.update(sql, book.getBookname(),book.getAuthor(),book.getTotalnum(),book.getNownum(),book.getIsbn());
	}

	public Book findByIsbn(String isbn) {
		String sql = "select * from t_book where isbn = ?";
		return DbHelp.query(sql, new BeanHandler<>(Book.class), isbn);
	}
	
	
	
	
	
}
