package bog_controllers;

import java.util.ArrayList;

import bog_models.Customer;
import bog_models.Data;
import bog_views.CustomersView;

public class CustomersController {
  private final Data dataStore = new Data();
  private final CustomersView customersView = new CustomersView();

  public void create(Customer customer) {
    // TODO: Data validation

    // Add new customer to data store
    dataStore.addCustomer(customer);

    // created customer as string
    customersView.render(customer);
  }

}
