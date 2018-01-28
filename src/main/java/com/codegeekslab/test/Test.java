package com.codegeekslab.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.codegeekslab.cart.ShoppingCart;
import com.codegeekslab.product.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("beans.xml");
		Product item1 = (Product) context.getBean("book");
		Product item2 = (Product) context.getBean("chips");
		Product item3 = (Product) context.getBean("chips2");
		ShoppingCart cart1 = (ShoppingCart) context.getBean("shoppingCart");
		cart1.addItem(item1);
		cart1.addItem(item2);
		System.out.println("Shopping cart 1 contains " + cart1.getItems());
		ShoppingCart cart2 = (ShoppingCart) context.getBean("shoppingCart");
		cart2.addItem(item3);
		System.out.println("Shopping cart 2 contains " + cart2.getItems());
		
 
	}
}
