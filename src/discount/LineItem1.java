///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package discount;
//
///**
// *
// * @author deepshikha
// */
//public class LineItem1 {
//    package findproduct;
//
///**
// *
// * @author jlombardoa
// */
//public class LineItem {
//    private String productId;
//    private double qty;
//    private Product product;
//    
//    
//    private Product[] productDb = {
//        new Product("A101","Hat",19.95, null),
//        new Product("B101","Glove",25.95, null),
//        new Product("C101","Belt",9.25, null)  
//    };
//
//    public LineItem(String productId, double qty) {
//        this.productId = productId;
//        this.qty = qty;
//        product = findProductById(productId);
//    }
//    
//    public String getLineItemData() {
//        return getProductId() + "    " + getName();
//    }
//    
//    private String getProductId() {
//        return product.getId();
//    }
//    private String getName() {
//        return product.getName();
//    }
//    
//    private Product findProductById(String id) {
//        Product product = null;
//        
//        for(Product p : productDb) {
//            if(id.equals(p.getId())) {
//                product = p;
//                break;
//            }
//        }
//        return product;
//    }
//    
//    public double getDiscount() {
//        return product.getDiscount(qty);
//    }
//
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//
//    public double getQty() {
//        return qty;
//    }
//
//    public void setQty(double qty) {
//        this.qty = qty;
//    }
//    
//    
//}
//
//}
