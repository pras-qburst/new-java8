package services;

import java.util.List;

import javax.persistence.Query;

import models.Category;
import play.db.jpa.JPA;



public class CategoryService {

	public Category getById(int id) {
		return JPA.em().find(Category.class, id);
	}
	
	public List<Category> getAllCategories() {
		
		Query query =JPA.em().createQuery("from Category");
		return query.getResultList();
	}

}