package nshekov.lesson10.Lab2_3.Lab2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductInBasket implements Basket{

    private Map<String, Integer> basket = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        if (basket.containsKey(product)) {
            basket.put(product, basket.get(product) + quantity);
        } else {
            basket.putIfAbsent(product, quantity);
        }
    }

    @Override
    public void removeProduct(String product) {
        basket.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        basket.put(product, quantity);
    }

    @Override
    public void clear() {
        basket.clear();

    }

    @Override
    public List<String> getProducts() {
        List<String> prod = new ArrayList<>();
        for (Map.Entry<String, Integer> item : basket.entrySet()){
            prod.add(item.getKey());
            System.out.println(item.getKey());
        }
        return prod;
    }

    @Override
    public int getProductQuantity(String product) {
        int a = basket.get(product);
        System.out.println("В корзине " + basket.get(product) + " " + product);
        return a;
    }
}
