
package discount;


public class Startup 
{
     public static void main(String args[])
    {
  
        Product[] productDb = 
        {
            new Product(null,"A101","Hat",19.95 ),
            new Product(null,"B101","Glove",25.95 ),
            new Product(null,"C101","Belt",9.25 )  
        };

        
      System.out.println("Line Item"+productDb);
        
      LineItem ln = new LineItem(productDb, 2);
      String pid=ln.getProductId();
      System.out.println("Line Item"+pid);
      
        
        
        
        
        
        
//     System.out.println("Product #1 is : ");
//     Product product1 = new Product( new NewYearDiscount(.20, 2 ),"11", "Shirt", 50.00);
//     double dis1 = product1.getDiscount(2);
//     double total1=product1.getTotal(50,2);
//     
//      System.out.println("\n ");
//      System.out.println("Product #2 is : ");
//     
//      Product product2 = new Product( new NoDiscount(0.0, 2 ),"11", "Shirt", 50.00);
//       double dis2 = product2.getDiscount(2);
//       double total2=product2.getTotal(50,2);
//       System.out.println("\n ");
//     //  System.out.println("Discount is " + dis2);
//       
       
       
       
       
       
       
       
    }   
}
