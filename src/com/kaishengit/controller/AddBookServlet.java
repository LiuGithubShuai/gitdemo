package com.kaishengit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kaishengit.exception.ServiceException;
import com.kaishengit.service.BookService;

public class AddBookServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		
		String bookname = req.getParameter("bookname");
		String author = req.getParameter("author");
		String totalnum = req.getParameter("totalnum");
		String nownum = req.getParameter("nownum");
		String isbn = req.getParameter("isbn");
		
		BookService bookService = new BookService();
		
		try {
			bookService.add(bookname,author,Integer.valueOf(totalnum),Integer.valueOf(nownum),isbn);
		} catch (ServiceException e) {
			req.setAttribute("bookname", bookname);
			req.setAttribute("author", author);
			req.setAttribute("totalnum", totalnum);
			req.setAttribute("nownum", nownum);
			req.setAttribute("isbn", isbn);
			
			req.setAttribute("message", e.getMessage());			
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
		
	}
	

}
