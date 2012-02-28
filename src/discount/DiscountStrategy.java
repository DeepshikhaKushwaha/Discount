/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discount;

/**
 *
 * @author deepshikha
 */
public interface DiscountStrategy {
     abstract double calculateDiscount(double price, int qty);
}
