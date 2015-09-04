package controllers;

import java.util.List;

import models.Category;
import play.Logger;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.CategoryService;
import services.ServicesInstances;

import com.fasterxml.jackson.databind.JsonNode;

public class ApplicationDBCall extends Controller{

	/*public static void getUserList(){
		Logger.info("getUserList");
		List<User> s = User.findAll();
		
	}*/
	
/*	@Transactional(readOnly=true)
	public static User findById(Long id) {
		  return JPA.em().find(User.class, id);
		}*/
	
    @Transactional(readOnly=true)
    public Result dbCategory() {
    	
    CategoryService categoryService = (CategoryService) ServicesInstances.CATEGORY_SERVICE.getService();
    Category category = categoryService.getById(1);
    Logger.debug("Found category: "+category);
    JsonNode json = Json.toJson(category);
    
    return ok(json);
    }
    
    @Transactional(readOnly=true)
    public Result dbShowAllCategories() {
    	
    CategoryService categoryService = (CategoryService) ServicesInstances.CATEGORY_SERVICE.getService();
    List<Category> categoryList = categoryService.getAllCategories();
    Logger.debug("Found category: "+categoryList);
    JsonNode jsonList = Json.toJson(categoryList);
    
    return ok(jsonList);
    }
    
}
