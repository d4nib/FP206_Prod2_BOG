package bog_controllers;

import java.util.ArrayList;

import bog_models.Order;
import bog_models.Data;
import bog_views.OrdersView;

public class OrdersController {
  private Data dataStore;
  private OrdersView ordersView;

  public OrdersController(Data dataStore) {
    this.dataStore = dataStore;
    this.ordersView = new OrdersView();
  }

  // List all
  public void list() {
    final ArrayList<Order> customers = dataStore.getOrders();
    this.ordersView.renderAll(customers);
  }

  // Create
  public void create(Order order) {
    // Add new order to data store
    try {
      this.dataStore.addOrder(order);
      this.ordersView.render(order);
    } catch (Exception e) {
      // print error
      this.ordersView.error(e);
    }

  }

  // Delete
  public void delete(Order order) {
    dataStore.deleteOrder(order);
  }

}