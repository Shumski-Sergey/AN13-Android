package ibagritsevich.lection_5.Task2;

public class InfoAnimal {
    public static void main(String[] args) {
        Goose goose = new Goose(70,3,2,"Белый","Травоядный");
        goose.InfoAboutAnimal();
        Dragon dragon = new Dragon(5800,7000,200, "Красный", "Мифический");
        dragon.InfoAboutAnimal();
        goose.getSize();
        dragon.getSize();
    }
}
