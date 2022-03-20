package bog_controllers;

import java.util.ArrayList;

import bog_models.Product;
import bog_models.Data;
import bog_views.ProductsView;

public class ProductsController {
  private Data dataStore;
  private ProductsView productsView;

  public ProductsController() {
    this.dataStore = new Data();
    this.productsView = new ProductsView();
  }

  // List all
  public void list() {
    final ArrayList<Product> products = dataStore.getProducts();
    this.productsView.renderAll(products);
  }

  // Create
  public void create(Product product) {
    // Add new Product to data store
    try {
      this.dataStore.addProduct(product);
      this.productsView.render(product);
    } catch (Exception e) {
      // print error
      this.productsView.error(e);
    }

  }

  // Delete
  public void delete(Product product) {
    this.dataStore.deleteProduct(product);
  }

}
