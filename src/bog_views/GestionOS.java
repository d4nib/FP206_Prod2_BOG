package bog_views;

import java.util.Scanner;

import bog_controllers.CustomersController;
import bog_controllers.OrdersController;
import bog_controllers.ProductsController;
import bog_models.Customer;
import bog_models.CustomerType;
import bog_models.Data;

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
    customersController.create(newCustomer);
  }

  public void createProduct(Scanner scanner) {
    System.out.print("SKU: ");
    String productId = scanner.next();
    System.out.print("Description: ");
    String description = scanner.next();
    System.out.print("Price: ");
    double price = scanner.nextDouble();
    System.out.print("Shipping Fee: ");
    double shippingFee = scanner.nextDouble();
    System.out.print("Handling Time: ");
    int handlingTime = scanner.nextInt();

  }

  public void createOrder(Scanner scanner) {
    System.out.print("Customer Email: ");
    String customerEmail = scanner.next();
    // Fetch customer data or quit
    // Print all products skus
    System.out.print("Product SKU: ");
    String productId = scanner.next();
    System.out.print("Quantity: ");
    int quantity = scanner.nextInt();

  }

  public void listProducts(Scanner scanner) {

  }

  public void listCustomers(Scanner scanner, CustomerType customerType) {
    // If customerType != nil show customer by type
    // Else show all customers
  }

  public void listOrders(Scanner scanner, Boolean sentStatus) {
    // If sentStatus show sent orders
    // Else show pending
  }

  public void deleteOrder(Scanner scanner) {
    System.out.print("Order ID: ");
    String orderId = scanner.next(); // No estoy seguro de si orderId es String o int
  }

}
