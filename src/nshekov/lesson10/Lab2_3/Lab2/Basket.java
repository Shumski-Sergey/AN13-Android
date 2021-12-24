package nshekov.lesson10.Lab2_3.Lab2;

import java.util.List;

public interface Basket {

    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    List<String> getProducts();

    int getProductQuantity(String product);

}
