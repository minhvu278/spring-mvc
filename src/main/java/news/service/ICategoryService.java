package news.service;

import news.model.CategoryModel;

import java.util.List;

public interface ICategoryService {
	List<CategoryModel> findAll();
}
