package bog_modelo;

import java.time.LocalDateTime;

public class Order {
    private String orderID;
    private Product product; 
    private Customer customer;
    private int product_qty;
    private double subtotal;
    private double shipingFee;
    private LocalDateTime creationDataTime;
    private int handlingTime;




    // CONSTRUCTOR
    public Order(String orderID, Product product, Customer customer, int product_qty, double subtotal, double shipingFee,
            LocalDateTime creationDataTime, int handlingTime) {
        this.orderID = orderID;
        this.product = product;
        this.customer = customer;
        this.product_qty = product_qty;
        this.subtotal = subtotal;
        this.shipingFee = shipingFee;
        this.creationDataTime = creationDataTime;
        this.handlingTime = handlingTime;
    }

    // CHECKERS - Comprueban las políticas de negocio y calculan resultados

    public boolean isCancellable(){
        
        /*if (LocalTime.now() > this.creationDataTime + handlingTime * 60){

        }*/

        return false;

    }

    public boolean clientExists(){

       return false; 
    }

    public double calculateShipping(){
        double ret;
        ret = this.shipingFee;
        return ret;
    }

    public double calculateOrderTotal(){
        double orderTotal;

        orderTotal = product_qty * this.product.getPrice() ;

        return orderTotal;

    }
//************************************************************************************
 /*
 Según demanda del producto faltarían los métodos:
        public boolean orderSent()

 */





    // GETTERS & SETTERS

    public String getorderID() {
        return orderID;
    }




    public void setorderID(String orderID) {
        this.orderID = orderID;
    }




    public Product getProduct() {
        return product;
    }




    public void setProduct(Product product) {
        this.product = product;
    }




    public Customer getCustomer() {
        return customer;
    }




    public void setCustomer(Customer customer) {
        this.customer = customer;
    }




    public int getProduct_qty() {
        return product_qty;
    }




    public void setProduct_qty(int product_qty) {
        this.product_qty = product_qty;
    }




    public double getSubtotal() {
        return subtotal;
    }




    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }




    public double getShipingFee() {
        return shipingFee;
    }




    public void setShipingFee(double shipingFee) {
        this.shipingFee = shipingFee;
    }




    public LocalDateTime getcreationDataTime() {
        return creationDataTime;
    }




    public void setcreationDataTime(LocalDateTime creationDataTime) {
        this.creationDataTime = creationDataTime;
    }




    public int gethandlingTime() {
        return handlingTime;
    }




    public void sethandlingTime(int handlingTime) {
        this.handlingTime = handlingTime;
    }



    @Override
    public String toString() {
        return "Order [creationDataTime=" + creationDataTime + ", customer=" + customer + ", handlingTime=" + handlingTime + ", product="
                + product + ", product_qty=" + product_qty + ", shipingFee=" + shipingFee + ", orderID=" + orderID
                + ", subtotal=" + subtotal + "]";
    }



    
    

    


    
}
