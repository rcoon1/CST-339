package com.gcu.dto;

public class AddProductDto {
	private String artist;
	private String title;
	private String description;
	private int decade;
	private double price;
	private String imageUrl;

	
	public AddProductDto() {
		
	}
	
	public AddProductDto(String artist, String title, String description, int decade, double price, String imageUrl) {
		
		super();
		this.artist = artist;
		this.title = title;
		this.description = description;
		this.decade = decade;
		this.price = price;
		this.imageUrl = imageUrl;
	}
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDecade() {
		return decade;
	}

	public void setDecade(int decade) {
		this.decade = decade;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String imageUrl() {
		return imageUrl;
	}

	public void imageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
}
