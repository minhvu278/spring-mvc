package news.dao;

import news.model.NewModel;
import news.paging.Pageble;

import java.util.List;

public interface INewDAO extends GenericDAO<NewModel> {
	NewModel findOne(Long id);
	List<NewModel> findByCategoryId(Long categoryId);
	Long save(NewModel newModel);
	void update(NewModel updateNew);
	void delete(long id);
	List<NewModel> findAll(Pageble pageble);
	int getTotalItem();
}
