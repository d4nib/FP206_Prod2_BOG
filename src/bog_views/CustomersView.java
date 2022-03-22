package bog_views;

import java.util.ArrayList;

import bog_models.Customer;

public class CustomersView {

  public void render(Customer customer) {
    System.out.println(customer.getFirstname() + " " + customer.getLastname() + " has been created");
  }

  public void renderAll(ArrayList<Customer> customers) {
    for (Customer customer : customers) {
      System.out.println(customer.getFirstname() + " " + customer.getLastname() + " | " + customer.getType());
    }
  }

  public void error(Exception exception) {
    System.out.println(exception);
  }
}
