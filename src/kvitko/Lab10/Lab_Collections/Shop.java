package kvitko.Lab10.Lab_Collections;

import java.util.*;

public class Shop implements Busket {
    int quantity;
    Map<String, Integer> item = new HashMap<>();


    public void addProduct(String product, int quantity) {
        int k;
        if (item.containsKey(product)) {
            for (Map.Entry<String, Integer> item1 : item.entrySet()) {
                if (item1.getKey().equals(product)) {
                    k = item1.getValue() + quantity;
                    item.put(product, k);
                }
            }
        } else {
            item.put(product, quantity);
        }
    }

    public void removeProduct(String product) {
        item.remove(product);
    }

    public void updateProductQuantity(String product, int quantity) {
        item.put(product, this.quantity);
    }

    public void clear() {
        item.clear();
    }

    public List<String> getProducts() {
        return new ArrayList<>(item.keySet());
    }

    public int getProductQuantity(String product) {
        int v = 0;
        for (Map.Entry thing : item.entrySet()) {
            if (thing.getKey().equals(product))
                v = (int) thing.getValue();
        }
        return v;
    }
}

