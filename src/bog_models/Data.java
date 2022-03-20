package bog_models;

import java.util.ArrayList;

public class Data {
    private CustomerList customers;
    private ProductList products;
    private OrderList orders;

    public Data() {
        this.customers = new CustomerList();
        this.products = new ProductList();
        this.orders = new OrderList();
    }

    // Customer data functions
    public ArrayList<Customer> getCustomers() {
        return this.customers.getArrayList();
    }

    public void addCustomer(Customer customer) throws Exception {
        try {
            this.customers.add(customer);
        } catch (Exception e) {
            throw e;
        }

    }

    public void deleteCustomer(Customer customer) {
        this.customers.delete(customer);
    }

    // Product data functions
    public ArrayList<Product> getProducts() {
        return this.products.getArrayList();
    }

    public void addProduct(Product product) throws Exception {
        try {
            this.products.add(product);
        } catch (Exception e) {
            throw e;
        }
    }

    public void deleteProduct(Product product) {
        this.products.delete(product);
    }

    // Order data functions
    public ArrayList<Order> getOrders() {
        return this.orders.getArrayList();
    }

    public void addOrder(Order order) throws Exception {
        try {
            this.orders.add(order);
        } catch (Exception e) {
            throw e;
        }

    }

    public void deleteOrder(Order order) {
        this.orders.delete(order);
    }

}
