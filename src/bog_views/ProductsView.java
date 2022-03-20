package bog_views;

import java.util.ArrayList;

import bog_models.Product;

public class ProductsView {

  public void render(Product product) {
    System.out.println("Product " + product.getProductName() + " - " + product.getPrice() + "€ has been created");
  }

  public void renderAll(ArrayList<Product> products) {
    for (Product product : products) {
      System.out.println(product.getproductID() + " " + product.getProductName() + " - " + product.getPrice() + "€");
    }
  }

  public void error(Exception exception) {
    System.out.println(exception);
  }
}
