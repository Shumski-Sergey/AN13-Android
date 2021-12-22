package ryancharuk.LabTen.Basket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ProdBasket implements Basket {

	 HashMap <String,Integer> pb = new HashMap<>();


	@Override
	public void addProduct(String product, int quantity) {
			pb.put(product,quantity);
	}

	@Override
	public void removeProduct(String product) {
		if (pb.containsKey(product)){
			pb.remove(product);
		}else {
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
		Integer count = 0;
		for (Integer entry: pb.values()) {
			count += entry;
		}
		return count;
	}
}
