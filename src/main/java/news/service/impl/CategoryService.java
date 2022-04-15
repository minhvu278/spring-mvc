package news.service.impl;

import news.dao.ICategoryDAO;
import news.model.CategoryModel;
import news.service.ICategoryService;

import java.util.List;

public class CategoryService implements ICategoryService {
	
	private ICategoryDAO categoryDao;

	@Override
	public List<CategoryModel> findAll() {
		return categoryDao.findAll();
	}
}
