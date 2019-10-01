package com.collabera.mongodbtest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Jojo")
public class Jojo {
	
	@Id
	private int id;
	private String name;
	private String stand;
	
	public Jojo() {};
	public Jojo(String name, String stand) {
		super();
		this.name = name;
		this.stand = stand;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStand() {
		return stand;
	}
	public void setStand(String stand) {
		this.stand = stand;
	}
	
	@Override
	public String toString() {
		return "ItemModel [id=" + id + ", name=" + name + ", stand=" + stand + "]";
	}
	
	

}
