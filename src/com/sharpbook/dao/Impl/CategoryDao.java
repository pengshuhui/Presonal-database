package com.sharpbook.dao.Impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sharpbook.dao.ICategoryDao;
import com.sharpbook.entity.Category;
import com.sharpbook.util.DbHelper;

public class CategoryDao extends DbHelper implements ICategoryDao {
	 List<Category> list=new ArrayList<Category>();
	@Override
	public List<Category> getAll() {
		dbConnections();
		try {
			pstate=connection.prepareStatement("select * from categoryinfo Order By CID");
			rSet =pstate.executeQuery();
			while(rSet.next()) {
				Category category= new Category();
				category.setCID(rSet.getInt("CID"));
				category.setCName(rSet.getString("CName"));
				list.add(category);
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
//	
//	public static void main(String[] args) {
//		CategoryDao category=new CategoryDao();
//		List<Category> list=category.getAll();
//		int i=0;
//		for(Category category2:list) {
//			System.out.println(list.get(i));
//			i++;
//		}
//	}
}
