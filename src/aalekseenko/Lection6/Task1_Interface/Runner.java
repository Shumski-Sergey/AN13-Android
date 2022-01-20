package aalekseenko.Lection6.Task1_Interface;

/*
Одежду можно (и нужно, пожалуй) носить, продавать и покупать, желательно — со скидкой.
Давайте расскажем это миру, и добавим все возможные интерфейсы из Movable, Sellable, Discountable в класс Clothes.
Ну а затем — реализуем их методы.
 */

public class Runner {
    public static void main(String[] args) {
        Clothes purchase = new Clothes("shoes", 4);
purchase.discount();
purchase.dressed();
purchase.soldOut();

System.out.println(purchase.getAmount());
System.out.println(purchase.getNameOfClothes());


    }
}
