package model;

import model.Product;

public class Main {

	public static void main(String[] args) {
		Product product = new Product("ABC123", "TV", 1000);
		/*product.setCode("ABC123");
		product.setName("TV");
		product.setPrice(1000);*/
		
		System.out.println("Code: " + product.getCode());
		System.out.println("Name: " + product.getName());
		System.out.println("Price: " + product.getPrice());
	}

}
