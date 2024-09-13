package com.streamapi;

public class Product {
	int id;
	String name;
	long price;

	public Product(int id, String name, long price) {
		this.id = id;
		this.name = name;
		this.price = price;

	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
