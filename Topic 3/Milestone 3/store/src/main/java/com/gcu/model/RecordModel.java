package com.gcu.model;

import org.springframework.lang.NonNull;


public class RecordModel {
	
	//basic variables for records
	@NonNull
	private String artist;
	
	@NonNull
	private String title;
	
	@NonNull
	private String description;
	
	@NonNull
	private int decade;
	
	@NonNull
	private double price;
	
	@NonNull
	private String imageUrl;
	
	@NonNull
	private int appId;
	

public RecordModel() {
	
}

public RecordModel(String artist, String title, String description, int decade, double price, String imageUrl) {
	
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

public int getAppId() {
	return appId;
}

public void setAppId(int appId) {
	this.appId = appId;
}

public String imageUrl() {
	return imageUrl;
}

public void imageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}




}

