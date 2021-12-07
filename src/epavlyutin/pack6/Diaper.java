package epavlyutin.pack6;

public class Diaper extends Clothes implements Movable,Sellable{
    public Diaper(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Одеваем " + name + " и носим");

    }

    @Override
    public void sell() {
        System.out.println("Снимаем грязный " + name + " и продаём");

    }
}
