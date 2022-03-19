package bog_models;

import java.util.ArrayList;

public class Data {
    private ArrayList<Customer> customers;
    private ArrayList<Product> products;
    private ArrayList<Order> orders;

    public Data() {
        this.customers = new ArrayList<Customer>();
        this.products = new ArrayList<Product>();
        this.orders = new ArrayList<Order>();
    }

    // Customer data functions
    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public void removeCustomer(int index) {
        this.customers.remove(index);
    }

    public String listCustomers() {
        return customers.toString(); // FALTA Diferenciar entre Premium y Standard
    }

    // Product data functions
    public ArrayList<Product> getProducts() {
        return this.products;
    }

    public void addProduct(Product p) {
        this.products.add(p);
    }

    public void removeProduct(int index) {
        this.products.remove(index);
    }

    public String listProducts() {
        return products.toString();
    }

    // Order data functions
    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order o) {
        this.orders.add(o);
    }

    public void removeOrder(int index) {
        this.orders.remove(index);
    }

    public String listOrders() {
        return orders.toString();
    }

}
