package bog_modelo;

import java.util.ArrayList;

public class Data {
    private ArrayList<Customer> customers;
    private ArrayList<Product> products;
    private ArrayList<Order> orders;



    // CONSTRUCTOR

    public Data() {
        this.customers = new ArrayList<Customer>();
        this.products = new ArrayList<Product>();
        this.orders = new ArrayList<Order>();
    }



    // Funciones ADD
    
    public void addCustomer(Customer c){
        this.customers.add(c);
    }
    
    public void addProduct(Product p){
        this.products.add(p);
    }

    public void addOrder(Order o){
        this.orders.add(o);
    }

    // Funciones REMOVE

    public void removeCustomer(int index){
        this.customers.remove(index);
    }

    public void removeProduct(int index){
        this.products.remove(index);
    }

    public void removeOrder(int index){
        this.orders.remove(index);
    }


    // Funciones LIST

    public String listOrders(){
        return orders.toString();
    }

    public String listProducts(){
        return products.toString();
    }

    public String listCustomers(){
        return customers.toString();  // FALTA Diferenciar entre Premium y Standard
    }

    // GETTERS & SETTERS

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
    

    
}
