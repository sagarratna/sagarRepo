package com.java.resturant.dto;

import java.io.Serializable;

public class ResturantDto implements Serializable {

	private Long id;
	private String menu;
	private String avgPrice;
	private String rating;

	public ResturantDto() {

	}

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getAvgPrice() {
		return avgPrice;
	}

	public void setAvgPrice(String avgPrice) {
		this.avgPrice = avgPrice;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "ResturantDto [id=" + id + ", menu=" + menu + ", avgPrice=" + avgPrice + ", rating=" + rating + "]";
	}






}
