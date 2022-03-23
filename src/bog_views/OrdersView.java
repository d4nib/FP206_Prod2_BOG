package bog_views;

import java.util.ArrayList;

import bog_models.Order;

public class OrdersView {

  public void render(Order order) {
    System.out.println(order.getorderID() + " | " + order.getProduct().getProductName() + " | " + order.getcreationDataTime() + " | " + order.getCustomer().getFirstname()+ " " + order.getCustomer().getLastname());
  }

  public void renderAll(ArrayList<Order> orders) {
    for (Order order : orders) {
      System.out.println(order.getorderID() + " | " + order.getProduct().getProductName() + " | " + order.getcreationDataTime() + " | " + order.getCustomer().getFirstname() + " " + order.getCustomer().getLastname());
    }
  }

  public void error(Exception exception) {
    System.out.println(exception);
  }
}
