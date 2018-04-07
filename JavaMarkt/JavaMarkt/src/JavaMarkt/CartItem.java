/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMarkt;

/**
 *
 * @author kamil
 */
public class CartItem {
	private Product product;
	private double currentPrice;
	
	public CartItem(Product product){
		this.product = product;
		this.currentPrice = product.getPrice();
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	@Override
	public String toString() {
		return "CartItem [product=" + product + ", currentPrice=" + currentPrice + "]";
	}
}
