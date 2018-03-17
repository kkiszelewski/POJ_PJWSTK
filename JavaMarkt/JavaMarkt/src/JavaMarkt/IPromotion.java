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
public interface IPromotion {
	boolean CanCalculate(Cart cart);
void CalculateOffer(Cart cart);
}
