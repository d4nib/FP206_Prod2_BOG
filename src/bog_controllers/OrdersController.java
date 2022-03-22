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
    final ArrayList<Order> orders = dataStore.getOrders();
    this.ordersView.renderAll(orders);
  }

  // List Sent Orders
  public void listSentOrders(){
    ArrayList<Order> orders = dataStore.getSentOrders();
    this.ordersView.renderAll(orders);
  }

  // List Pending Orders
  public void listPendingOrders(){
    ArrayList<Order> orders = dataStore.getPendingOrders();
    this.ordersView.renderAll(orders);
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

  // Return Order from ID/SKU
  public Order returnOrder(String id){
    Order order = null;
    for (int i = 0; i < this.dataStore.lenghtOrders(); i++){
      if (id.equals(this.dataStore.getOrders().get(i).getorderID())){
        order = this.dataStore.getOrders().get(i);
      }
    }
    return order;
  }





}
