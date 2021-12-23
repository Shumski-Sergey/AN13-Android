package ryancharuk.LabTen.Basket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ProdBasket implements Basket {

	HashMap<String, Integer> pb = new HashMap<>();


	@Override
	public void addProduct(String product, int quantity) {
		int emp;
		if (pb.containsKey(product)) {
			for (Map.Entry<String, Integer> item : pb.entrySet()) {
				if (item.getKey().equals(product)) {
					emp = item.getValue() + quantity;
					pb.put(product, emp);
				}
			}
		} else {
			pb.put(product, quantity);
		}
	}


	@Override
	public void removeProduct(String product) {
		if (pb.containsKey(product)) {
			pb.remove(product);
		} else {
			System.out.println("Такого продукта нет в вашей корзине");
		}
	}

	@Override
	public void updateProductQuantity(String product, int quantity) {

	}

	@Override
	public void clear() {
		pb.clear();

	}

	@Override
	public List<String> getProducts() {

		return new ArrayList<>(pb.keySet());
	}

	@Override
	public int getProductQuantity(String product) {
		int a = 0;
		for (Map.Entry item : pb.entrySet()) {
			if (item.getKey().equals(product)) {
				a = (int) item.getValue();
			}
		}
		return a;
	}
}
