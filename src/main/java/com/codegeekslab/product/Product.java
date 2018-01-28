package com.codegeekslab.product;

public abstract class Product {
	private String name;
	private float price;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Chips [name=" + name + ", price=" + price + "]";
	}
}
