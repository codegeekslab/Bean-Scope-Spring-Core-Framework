package com.codegeekslab.items;

import com.codegeekslab.product.Product;

public class Chips extends Product {

	private String flavour;

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	@Override
	public String toString() {
		return "Chips [flavour=" + flavour + "]";
	}

}
