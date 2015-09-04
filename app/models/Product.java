package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private int id;
	
 
 private int categoryId;
 
 private String name;
 
 private String description;
 
 private Double price;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getCategoryId() {
	return categoryId;
}

public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public Double getPrice() {
	return price;
}

public void setPrice(Double price) {
	this.price = price;
}
 
 
 

}
