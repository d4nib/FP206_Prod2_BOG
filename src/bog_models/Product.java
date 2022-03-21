package bog_models;

import java.util.ArrayList;


public class Product {
    private String productID;
    private String productName;
    private String description;
    private double price;
    private double shippingFee;
    private int handlingTime;
    private ArrayList<Order> orders;

    // CONSTRUCTOR
    public Product(String productID, String productName, String description2, double price, double shippingFee,
            int handlingTime) {
        this.productID = productID;
        this.productName = productName;
        this.description = description2;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
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
