/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discount;

/**
 *
 * @author deepshikha
 */
public class LineItem {
private Product product;
private String productId;
private int qty;

private Product[] productDb = {
    new Product(null,"A101","Hat",19.95 ),
    new Product(null,"B101","Glove",25.95 ),
    new Product(null,"C101","Belt",9.25 )  
};


public LineItem(Product[] productId , int qty) {
    this.productDb =  productId;
    this.qty = qty;
}

    public String getProductId()
    {
    return product.getProductID();
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    
    private String getName() 
    {
    return product.getProductDesc();
    }
    public String getLineItemData() 
    {
    return getProductId() + "    " + getName();
    }

    public  Product getProduct()
    {   
    return product;
    }

    public void setProduct(Product product) 
    {
    this.product = product;
    }

    public double getDiscount() 
    {
    return product.getDiscount(qty);
    }

    public int getQty() 
    {
    return qty;
    }

    public void setQty(int qty) 
    {
    this.qty = qty;
    }





public double setDiscountAmt()
{
    return 0;
}

public double getItemTotal()
{
return 0;
}

public double getSubtotal()
{
    return 0;
}

}
