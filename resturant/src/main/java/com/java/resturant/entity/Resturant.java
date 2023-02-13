package com.java.resturant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.java.resturant.appconstants.SqlConstanta;

@Entity
@Table(name = SqlConstanta.RESTURANT_INFO)
public class Resturant {
	@Id
	@GenericGenerator(name = "r_auto", strategy = "increment")
	@GeneratedValue(generator = "r_auto")
	@Column(name = "id")
	public Long id;
	@Column(name = "resName")
	public String resName;
	@Column(name = "menu")
	public String menu;
	@Column(name = "type")
	public String type;
	@Column(name = "avgPrice")
	public String avgPrice;
	@Column(name = "contactNumber")
	public String contactNumber;
	@Column(name = "rating")
	public String rating;


	public Resturant() {

	}


	public long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getResName() {
		return resName;
	}


	public void setResName(String resName) {
		this.resName = resName;
	}


	public String getMenu() {
		return menu;
	}


	public void setMenu(String menu) {
		this.menu = menu;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getAvgPrice() {
		return avgPrice;
	}


	public void setAvgPrice(String avgPrice) {
		this.avgPrice = avgPrice;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getRating() {
		return rating;
	}


	public void setRating(String rating) {
		this.rating = rating;
	}


	@Override
	public String toString() {
		return "Resturant [id=" + id + ", resName=" + resName + ", menu=" + menu + ", type=" + type + ", avgPrice="
				+ avgPrice + ", contactNumber=" + contactNumber + ", rating=" + rating + "]";
	}







}
