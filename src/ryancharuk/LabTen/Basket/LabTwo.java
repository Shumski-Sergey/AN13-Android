package ryancharuk.LabTen.Basket;



public class LabTwo {
	public static void main(String[] args) {
		ProdBasket basket = new ProdBasket();
		basket.addProduct("Хлеб",2);
		basket.addProduct("Масло",3);
		basket.addProduct("Молоко",4);
		basket.addProduct("Вода",5);

		System.out.println(basket.getProducts());
		basket.removeProduct("Масло");
		System.out.println(basket.getProducts());

	}
}
