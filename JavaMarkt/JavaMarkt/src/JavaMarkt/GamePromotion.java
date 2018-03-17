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
public class GamePromotion implements IPromotion{

	@Override
	public boolean CanCalculate(Cart cart) {
		double koszykBrutto = cart.totalPriceOfProducts();
		if (koszykBrutto >= 150)
			return true;
		else
			return false;
	}

	boolean mugAdded(Cart cart) {
		boolean itIs = false;
		for(CartItem it : cart.getItems()) {
			if (it.getProduct().getName().equals("PCGame")) {
				itIs = true;
			}
		}
		return itIs;
	}
	
	@Override
	public void CalculateOffer(Cart cart) {
		if (this.CanCalculate(cart) && !this.mugAdded(cart))
			cart.addProduct(new Product("PCGame", 0.1));
		
	}

	@Override
	public String toString() {
		return "PCGame [Gra Promocyjna]";
	}
}
