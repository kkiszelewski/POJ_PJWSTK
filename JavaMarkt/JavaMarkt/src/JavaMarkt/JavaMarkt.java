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
public class JavaMarkt {
    
    public static void main(String[] args) {
		//System.out.println(getSampleCart().getItems());
		Cart cart = new Cart();
		cart.addProduct(new Product("Kartofle", 200))
		    .addProduct(new Product("Woda", 120))
		    .addPromotion(new ValuePromotion())
		    .applyPromotions();

		System.out.println(cart);

		cart.addPromotion(new MugPromotion())
		    .applyPromotions()
		    .applyPromotions();

		//System.out.println(cart);
}
    
}
