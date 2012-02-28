
package discount;

public class NewYearDiscount implements DiscountStrategy
{
//    private double amt;
    private double percent;
    private int qty;

    public NewYearDiscount( double percent, int qty) {
//        this.amt = amt;
        this.percent = percent;
        this.qty = qty;
    }


//    public double getAmt() {
//        return amt;
//    }
//
//    public void setAmt(double price) {
//        this.amt = price;
//    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
   // calculateDiscount
   
    public double calculateDiscount(double price, int qty)
    {   
          //System.out.println("parameters are " + price+"qty : "+qty+"percent: " +percent);
          return price* percent* qty;   
         
    }

   
}
