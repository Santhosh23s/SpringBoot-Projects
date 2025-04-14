package com.codeWithSan.San.Models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public int getStocks() {
		return stocks;
	}
	public void setStocks(int stocks) {
		this.stocks = stocks;
	}
	public int getNumberOfviews() {
		return numberOfviews;
	}
	public void setNumberOfviews(int numberOfviews) {
		this.numberOfviews = numberOfviews;
	}
	
	@ElementCollection
	@Column(name = "image_url")
	private List<String> image;
	public List<String> getImage() {
		return image;
	}
	public void setImage(List<String> image) {
		this.image = image;
	}
	public Product(String name, double price, String description, double ratings, String category, String seller,
			int stocks, int numberOfviews,List<String> image) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.ratings = ratings;
		this.category = category;
		this.seller = seller;
		this.stocks = stocks;
		this.numberOfviews = numberOfviews;
		this.image = image;
	}
	public Product() {
		super();
	}
	private String name;
	private double price;
	private String description;
	private double ratings;
	private String category;
	private String seller;
	private int stocks;
	private int numberOfviews;

}
