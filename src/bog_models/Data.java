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

        cargarDatos();

    }
    private void cargarDatos(){
        Customer customer = new Customer("Paco", "Saiz", "psaiz@gmail.com", "C/Toledo 178", "12345678A", CustomerType.REGULAR);
        try {
            customers.add(customer);
            customer = new Customer("Jose", "Perez", "jper3z@gmail.com", "C/desesperao 78", "19835648S", CustomerType.REGULAR);
            customers.add(customer);
            customer = new Customer("Maria", "Hernandez", "mariahernan@gmail.com", "Av.Balcao 197", "36184656Y", CustomerType.PREMIUM);
            customers.add(customer);
            customer = new Customer("Sara", "Cabrer", "tupacsacura@gmail.com", "C/Verano 2", "97385673U", CustomerType.PREMIUM);
            customers.add(customer);
            customer = new Customer("Samuel", "Bolivar", "samusitoBol@gmail.com", "C/Colorado 34", "92648762F", CustomerType.REGULAR);
            customers.add(customer);
        } catch (Exception e) {
            
        }

        Product product = new Product("001A", "Aspirador TORIEL ", "La aspiradora capaz de limpiar la casa despues de una fiesta de fraternidad", 1.4d, 29d, 2);
        try {
            products.add(product);
            product = new Product("002A", "Aspirador TORIEL mini", "La aspiradora de mano capaz de limpiar el macdonald despues de un buffet libre", 2d, 20d, 2);
            products.add(product);
            product = new Product("003A", "Cascos wireless SAMUSNG Azules", "Cascos marca SAMUSNG de color azul sin cable con cargador incluido", 3.4d, 46.7d, 1);
            products.add(product);
            product = new Product("004A", "Reloj mecanico MANLESS", "Reloj de muñeca mecanico dorado con agujas de plata cristalizada y cristal templado resistente a todo tipo de golpe", 5d, 54.9d, 4);
            products.add(product);
            product = new Product("005A", "Deportivas NIKE bump fresh 4", "Deportivas NIKE de color negras y rojas, Sirven para caminar mas rapido, creo", 2.4d, 60.9d, 2);
            products.add(product);
            product = new Product("006A", "Gorra NEW ERA New York classic 1976", "Una de las gorras clasicas de la compañia NEW ERA. La primera New York que salio", 4d, 75.9d, 5);
            products.add(product);
            
        } catch (Exception e) {
            
        }
        Order order = new Order(products.getAt(0), customers.getAt(0), 1);
        try {
            orders.add(order);
            order = new Order(products.getAt(1), customers.getAt(3), 2);
            orders.add(order);
            order = new Order(products.getAt(2), customers.getAt(2), 1);
            orders.add(order);
            order = new Order(products.getAt(3), customers.getAt(4), 3);
            orders.add(order);
            order = new Order(products.getAt(5), customers.getAt(0), 1);
            orders.add(order); 
            order = new Order(products.getAt(4), customers.getAt(1), 2);
            orders.add(order); 

        } catch (Exception e) {
            
        }
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

    public boolean existsCustomer(String email){
        return this.customers.contains(email);
    }

    public int lenghtCustomer(){
        return this.customers.getSize();
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

    public int lenghtProduct (){
        return this.products.getSize();
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

    public int lenghtOrders(){
        return this.orders.getSize();
    }

   

}
