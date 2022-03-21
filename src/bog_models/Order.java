package bog_models;

import java.time.LocalDateTime;

import bog_controllers.OrdersController;



public class Order {
    public static int orderIDnumber;
    private String orderID;
    private Product product;
    private Customer customer;
    private int productQuantity;
    private double subtotal;
    private double shippingFee;
    private LocalDateTime creationDataTime;
    private int handlingTime;
    private boolean isSent;

    // CONSTRUCTOR
    public Order(Product product, Customer customer, int productQuantity) {
        this.orderID = orderID;
        this.product = product;
        this.customer = customer;
        this.productQuantity = productQuantity;
        this.subtotal = this.product.getPrice() * productQuantity;
        this.shippingFee = calculateShipping();
        this.creationDataTime = LocalDateTime.now();
        this.handlingTime = 2;

    }
    public static String orderIdGenerator(){
        orderIDnumber++;
        return String.valueOf(orderIDnumber);
    }
    

    // CHECKERS - Comprueban las políticas de negocio y calculan resultados
    public boolean isCancellable() {

        return !isSent; // Si esta enviado, no se puede cancelar. Así de simple
    }

    public boolean clientExists() {

        return false;
    }

    public double calculateShipping() {
        final double customerDiscount = this.customer.getCustomerDiscount() / 100;
        final double shippingWithDiscount = customerDiscount > 0 ? this.shippingFee / customerDiscount
                : this.shippingFee;
        return shippingWithDiscount;
    }

    public double calculateOrderTotal() {
        final double productPrice = this.productQuantity * this.product.getPrice();
        final double shipping = calculateShipping();
        final double orderTotal = productPrice + shipping;
        return orderTotal;
    }

    public boolean orderSent() {
        // Creamos la fecha en la que el pedido estará lista
        LocalDateTime handlingResult = creationDataTime.plusDays(handlingTime);

        // Pasada esa fecha el articulo se habrá enviado
        if (LocalDateTime.now().compareTo(handlingResult) > 0) {
            isSent = true;
        } else {
            isSent = false;
        }

        return isSent;
    }



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

    public int getproductQuantity() {
        return productQuantity;
    }

    public void setproductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getShippingFee() {
        return shippingFee;
    }

    public void setShipingFee(double shipingFee) {
        this.shippingFee = shipingFee;
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
        return "Order [creationDataTime=" + creationDataTime + ", customer=" + customer + ", handlingTime="
                + handlingTime + ", product="
                + product + ", productQuantity=" + productQuantity + ", shipingFee=" + shippingFee + ", orderID="
                + orderID
                + ", subtotal=" + subtotal + "]";
    }

}
