// Description: 
// Design a Product class with attributes such as productId, productName, and price. Use a constructor to initialize these attributes and create a method to display product details.

class Product{
    private static final int MAX_PRODUCT_ID=999;
    private static final int MIN_PRODUCT_ID=100;
    private static final int MAX_PRODUCT_NAME_LENGTH=40;
    private static final int MIN_PRODUCT_NAME_LENGTH=3;
    private static final String PRODUCT_NAME_PATTERN="[A-Za-z]+";
    private static final double MAX_PRODUCT_PRICE=1000000.00;
    private static final double MIN_PRODUCT_PRICE=1.00;
    private int productId;
    private String productName;
    private double price;
    public Product(int productId,String productName,double price){
        validateProduct(productId,productName,price);
        this.price=price;
        this.productName=productName;
        this.price=price;
    }
    public void validateProduct(int productId,String productName,double price){
        if(productId<MIN_PRODUCT_ID || productId>MAX_PRODUCT_ID) throw new IllegalArgumentException("Product Id cant exceed the limits [100,999]");
    
        if(productName==null || productName.trim().isEmpty()) throw new IllegalArgumentException("ProductName can't be null or empty");
        String trimmedProductName = productName.trim();
        if(trimmedProductName.length()<MIN_PRODUCT_NAME_LENGTH || trimmedProductName.length()>MAX_PRODUCT_NAME_LENGTH) throw new IllegalArgumentException("Product name length should be between 3 to 40 characters");
        if(!trimmedProductName.matches(PRODUCT_NAME_PATTERN))throw new IllegalArgumentException("ProductName contains Invalid characters");
        if(price<MIN_PRODUCT_PRICE || price>MAX_PRODUCT_PRICE) throw new IllegalArgumentException("Invalid product price , price should be between [1.00,1000000.00");
    }
    public int getProductId(){
        return productId;
    }
    public String getProductName(){
        return productName;
    }
    public double getProductPrice(){
        return productPrice;
    }

    public void setProductId(int productId){
        this.productId=productId;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }
    public void setPrice(double price){
        this.price=price;
    }

    public String getProductDetails(){
        return "Product Id : " + productId +",Product Name : " + productName+", Price : "+price;
    }

}
public class Task1 {
    public static void main(String[] args){

        Product p1 = new Product(101,"Apple",970.34);
        Product p2 = new Product(564,"Headphones",9000);
        Product p3 = new Product(999,"Switches",670000);

        System.out.println(p1.getProductDetails());
        System.out.println(p2.getProductDetails()+"\n"+p3.getProductDetails());
    }
}
