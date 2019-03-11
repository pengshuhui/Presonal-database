package com.sharpbook.service.Impl;

import java.util.List;

import com.sharpbook.dao.Impl.BookDao;
import com.sharpbook.entity.Book;
import com.sharpbook.service.IBookService;

public class BookService implements IBookService {
	BookDao bDao=new BookDao();
	@Override
	public List<Book> getAllBook() {
		
		return bDao.getAllBook();
	}

}
