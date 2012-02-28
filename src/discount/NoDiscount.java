/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discount;

/**
 *
 * @author deepshikha
 */
public class NoDiscount implements DiscountStrategy
{
    
    private double percent = 0.0;
     private int qty;

    public NoDiscount( double percent, int qty) {
       // this.amt = amt;
        this.percent = percent;
        this.qty = qty;
    }
    
    public double calculateDiscount(double price, int qty)
    {   
         // System.out.println("parameters of NoDiscount: " + price+ " qty : "+qty+" percent: " +percent);
          return price *  percent * qty;   
         
    }
}
