package bog_controllers;

import java.util.ArrayList;


import bog_models.Customer;
import bog_models.Data;
import bog_views.CustomersView;


public class CustomersController {
  private Data dataStore;
  private CustomersView customersView;
  

  public CustomersController(Data dataStore) {
    this.dataStore = dataStore;
    this.customersView = new CustomersView();
  }

  // List Methods
  public void list() {
    final ArrayList<Customer> customers = dataStore.getCustomers();
    this.customersView.renderAll(customers);
  }

  public void listPremium() {
    ArrayList<Customer> customers = dataStore.getPremiumCustomers();
    this.customersView.renderAll(customers);
  }
  public void listRegular() {
    ArrayList<Customer> customers = dataStore.getRegularCustomers();
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

  // Check if Customer exists
  public boolean exists(String email){
    return this.dataStore.existsCustomer(email);

  }

  // Returns Customer for email
  public Customer returnCustomer(String email){
    Customer customer = null;
    try{
      for (int i = 0 ; i < this.dataStore.lenghtCustomer(); i++ ){
        if (email.equals(this.dataStore.getCustomers().get(i).getEmail()) ){
          customer = this.dataStore.getCustomers().get(i);
        }
      }
    } catch(Exception e){
      customersView.error(e);
    }
    return customer;
  }
}
