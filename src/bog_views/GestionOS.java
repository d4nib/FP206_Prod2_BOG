package bog_views;


import java.util.Scanner;

import bog_controllers.CustomersController;
import bog_controllers.OrdersController;
import bog_controllers.ProductsController;
import bog_models.Customer;
import bog_models.CustomerType;
import bog_models.Data;
import bog_models.Order;
import bog_models.Product;

public class GestionOS {
  private Data dataStore;
  private CustomersController customersController;
  private OrdersController ordersController;
  private ProductsController productsController;

  public GestionOS() {
    this.dataStore = new Data();
    this.customersController = new CustomersController(this.dataStore);
    this.productsController = new ProductsController(this.dataStore);
    this.ordersController = new OrdersController(this.dataStore);
  }

  public void createCustomer(Scanner scanner) {
    System.out.println("=== Create Customer: ");
    System.out.print("First name: ");
    String firstname = scanner.next();
    System.out.print("Last name: ");
    String lastname = scanner.next();
    System.out.print("Email: ");
    String email = scanner.next();
    System.out.print("Address: ");
    String address = scanner.next();
    System.out.print("ID Card Number: ");
    String idCardNumber = scanner.next();
    System.out.print("Type (Regular/Premium): ");
    String typeStr = scanner.next();
    CustomerType customerType = CustomerType.valueOf(typeStr.toUpperCase());

    final Customer newCustomer = new Customer(firstname, lastname, email, address, idCardNumber, customerType);
    this.customersController.create(newCustomer);
  }

  public void createProduct(Scanner scanner) {
    System.out.println("=== Create Product: ");
    System.out.print("SKU: ");
    String productId = scanner.next();
    System.out.print("Name: ");
    String name = scanner.next();
    System.out.print("Description: ");
    String description = scanner.next();
    System.out.print("Price: ");
    double price = scanner.nextDouble();
    System.out.print("Shipping Fee: ");
    double shippingFee = scanner.nextDouble();
    System.out.print("Handling Time: ");
    int handlingTime = scanner.nextInt();
    
    final Product newProduct = new Product(productId, name, description , price, shippingFee, handlingTime);
    this.productsController.create(newProduct);

  }

  public void createOrder(Scanner scanner) {
    Customer customer;
    Product product;
    System.out.println("=== Create Order: ");
    System.out.print("Customer Email: ");
    String customerEmail = scanner.next();
    if (!this.customersController.exists(customerEmail) ){
      System.out.print("* Enter new customer: \n");
      this.createCustomer(scanner);
    } else System.out.print("* This customer is aready in data base \n");
    customer = this.customersController.returnCustomer(customerEmail);
    this.productsController.list();
    System.out.print("Product SKU: ");
    String productId = scanner.next();
    product = this.productsController.returnProduct(productId);
    System.out.print("Quantity: ");
    int quantity = scanner.nextInt();
    final Order newOrder = new Order(product, customer,  quantity);
    this.ordersController.create(newOrder);

  }

  public void listProducts(Scanner scanner) {
    productsController.list();

  }

  public void listCustomers(Scanner scanner, CustomerType customerType) {
    // If customerType != nil show customer by type
    if (customerType != null){
      if (customerType == CustomerType.REGULAR){
        customersController.listRegular();
      }
      if (customerType == CustomerType.PREMIUM){
        customersController.listPremium();
      }
    }
    else {
    // Else show all customers
    customersController.list();
    }
  }

  public void listOrders(Scanner scanner, Boolean sentStatus) {
    // If sentStatus show sent orders
    if (sentStatus){
      ordersController.listSentOrders();
      // Else show pending
    } 
    else if (!sentStatus){
      ordersController.listPendingOrders();
    }
    else {ordersController.list();}
  }

  public void deleteOrder(Scanner scanner) {
    Order order;
    System.out.print("Order ID: ");
    String orderId = scanner.next(); // No estoy seguro de si orderId es String o int
    order =this.ordersController.returnOrder(orderId);
    if (order.isCancellable()){
      this.ordersController.delete(order);
    }
    else System.out.println ("This Order is not cancellable");
  }

}
