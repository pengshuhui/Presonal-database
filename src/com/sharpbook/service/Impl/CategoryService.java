package com.sharpbook.service.Impl;

import java.util.List;

import com.sharpbook.dao.Impl.CategoryDao;
import com.sharpbook.entity.Category;
import com.sharpbook.service.ICategoryService;

public class CategoryService implements ICategoryService {
	CategoryDao ca=new CategoryDao();
	@Override
	public List<Category> getAll() {
		
		return ca.getAll();
	}

}
