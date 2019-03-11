package com.sharpbook.dao.Impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sharpbook.entity.*;
import com.sharpbook.dao.IBookDao;
import com.sharpbook.entity.Book;
import com.sharpbook.util.DbHelper;

public class BookDao extends DbHelper implements IBookDao {

	
	List<Book> list=new ArrayList<Book>();
	@Override
	public List<Book> getAllBook() {
		dbConnections();
		try {
			pstate=connection.prepareStatement("select * from bookinfo left join categoryInfo on (BCategoryID = CID) Order By BID");
			rSet =pstate.executeQuery();
			while(rSet.next()) {
				Book book= new Book();
				book.setBID(rSet.getInt("BID"));
				book.setBAuthor(rSet.getString("BAuthor"));
				book.setBPhoto(rSet.getString("BPhoto"));
				book.setBPrice(rSet.getDouble("BPrice"));
				book.setBPublisher(rSet.getString("BPublisher"));
				book.setBTitle(rSet.getString("BTitle"));
				Category c = new Category();
				c.setCID(rSet.getInt("BCategoryID"));
				c.setCName(rSet.getString("CName"));
				book.setBCategoryID(c);
				list.add(book);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("运行时发生的一个SQLexception："+e);
		}
		finally {
			close();
		}
		return list;
	}
	//单元测试
//public static void main(String[] args) {
//	BookDao bookDao=new BookDao();
//	List<Book> list=bookDao.getAllBook();
//	int i=0;
//	for(Book book:list) {
//		System.out.println(list.get(i));
//		i++;
//}
	
//}
}
