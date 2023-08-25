package com.skcet.Restapispring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="table2")
public class Order {
	@Id
	
private long id;
private String name;
private long price;
private int quality;
@Transient
private long totalprice;
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
public long getPrice() {
	return price;
}
public void setPrice(long price) {
	this.price = price;
}
public int getQuality() {
	return quality;
}
public void setQuality(int quality) {
	this.quality = quality;
}
public long getTotalprice() {
	return totalprice;
}
public void setTotalprice(long totalprice) {
	this.totalprice = totalprice;
}
public Order(long id, String name, long price, int quality, long totalprice) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.quality = quality;
	this.totalprice = totalprice;
}
public Order() {
	
}

}
