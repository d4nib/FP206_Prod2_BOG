package bog_modelo;


import java.util.ArrayList;

import org.w3c.dom.Text;

public class Product {
    private String productID;
    private String productName;
    private Text description;
    private double price;
    private double shippingFee;
    private int handlingTime;
    private ArrayList<Order> orders;




    // CONSTRUCTOR
    public Product(String productID, String productName, Text description, double price, double shippingFee, int handlingTime) {
        this.productID = productID;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.shippingFee = shippingFee;
        this.handlingTime = handlingTime;
        this.orders = new ArrayList<Order>();
    }


   







       // GETTERS & SETTERS
    public String getproductID() {
        return productID;
    }



    public void setproductID(String productID) {
        this.productID = productID;
    }



    public String getProductName() {
        return productName;
    }



    public void setProductName(String productName) {
        this.productName = productName;
    }



    public Text getDescription() {
        return description;
    }



    public void setDescription(Text description) {
        this.description = description;
    }



    public double getPrice() {
        return price;
    }



    public void setPrice(double price) {
        this.price = price;
    }



    public double getShippingFee() {
        return shippingFee;
    }



    public void setShippingFee(double shippingFee) {
        this.shippingFee = shippingFee;
    }



    public int gethandlingTime() {
        return handlingTime;
    }



    public void sethandlingTime(int handlingTime) {
        this.handlingTime = handlingTime;
    }




    public ArrayList<Order> getOrders() {
        return orders;
    }



    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }


    

    


    
    
}

