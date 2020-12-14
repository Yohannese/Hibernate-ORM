package com.orm.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="vehicle_tbl")
public class Vehicle {

	@Id 
	@GeneratedValue (strategy= GenerationType.AUTO)
	private int vid;
	private String brand;
	private String color;
	public int getVid() {
			
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", brand=" + brand + ", color=" + color + "]";
	}

}
