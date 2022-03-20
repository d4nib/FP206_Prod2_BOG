package bog_controllers;

import java.util.ArrayList;

import bog_models.Customer;
import bog_models.Data;
import bog_views.CustomersView;

public class CustomersController {
  private Data dataStore;
  private CustomersView customersView;

  public CustomersController() {
    this.dataStore = new Data();
    this.customersView = new CustomersView();
  }

  // List all
  public void list() {
    final ArrayList<Customer> customers = dataStore.getCustomers();
    this.customersView.renderAll(customers);
  }

  // Create
  public void create(Customer customer) {
    // Add new customer to data store
    try {
      this.dataStore.addCustomer(customer);
      this.customersView.render(customer);
    } catch (Exception e) {
      // print error
      customersView.error(e);
    }

  }

  // Delete
  public void delete(Customer customer) {
    this.dataStore.deleteCustomer(customer);
  }

}
