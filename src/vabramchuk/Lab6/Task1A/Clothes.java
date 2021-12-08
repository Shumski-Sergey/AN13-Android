package vabramchuk.Lab6.Task1A;

public class Clothes implements Movable, Sellable, Discountable{

    public void mov(){
        System.out.println("Купить одежду");
    }
    public void sell(){
        System.out.println("Носить одежду");
    }
    public void discount(){
        System.out.println("Продать со скидкой");
    }


}
