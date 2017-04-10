package com.kaishengit.service;

import com.kaishengit.dao.BookDao;
import com.kaishengit.entity.Book;
import com.kaishengit.exception.ServiceException;


/**
 * 处理业务逻辑
 * @author Administrator
 *
 */
public class BookService {

	private BookDao bookDao = new BookDao();	
	
	public void add(String bookname, String author, Integer totalnum, Integer nownum, String isbn) 
			throws ServiceException {
		
		Book book = bookDao.findByIsbn(isbn);
		
		if(book == null){		
			Book book1 = new Book();
			
			book1.setBookname(bookname);
			book1.setAuthor(author);
			book1.setTotalnum(Integer.valueOf(totalnum));
			book1.setNownum(Integer.valueOf(nownum));
			book1.setIsbn(isbn);
			
			bookDao.addBook(book1);
		}else{
			throw new ServiceException ("ISBN重复，保存失败");
		}
	}

}
