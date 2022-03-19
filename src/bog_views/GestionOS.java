package bog_views;

import java.util.Scanner;

import bog_controllers.CustomersController;
import bog_models.Customer;
import bog_models.CustomerType;

public class GestionOS {

  private final CustomersController customersController = new CustomersController();

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

  }

  public void createOrder(Scanner scanner) {

  }

}
