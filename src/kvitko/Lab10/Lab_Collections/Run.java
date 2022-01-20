package kvitko.Lab10.Lab_Collections;

import java.util.Collections;

public class Run {
    public static void main(String[] args) {
        Shop shop=new Shop();
        shop.addProduct("milk", 90);
        shop.addProduct("bread", 70);
        shop.addProduct("cheese", 120);
        System.out.println(shop.getProducts());
        shop.removeProduct("bread");
        System.out.println(shop.getProducts());
        System.out.println(shop.getProductQuantity("cheese"));
    }
}
