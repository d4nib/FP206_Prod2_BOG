package bog_views;

import bog_models.Customer;

public class CustomersView {

  public void render(Customer customer) {
    System.out.println(customer.getFirstname() + " " + customer.getLastname() + " has been created");
  }

  public void error(Exception exception) {
    System.out.println(exception);
  }
}
