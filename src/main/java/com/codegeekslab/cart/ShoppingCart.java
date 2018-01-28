package com.codegeekslab.cart;

import java.util.ArrayList;
import java.util.List;

import com.codegeekslab.product.Product;

public class ShoppingCart {
	private List<Product> items = new ArrayList<Product>();

	public void addItem(Product item) {
		items.add(item);
	}

	public List<Product> getItems() {
		return items;
	}
}
