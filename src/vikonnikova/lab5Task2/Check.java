package vikonnikova.lab5Task2;

public class Check {
    public static void main(String[] args) {
        BigAnimal Dragon = new Dragon ("Dragon", "big");
        SmallAnimal Goose = new Goose ("Goose", "small");
        System.out.println(Dragon.getName() + " " + "is" + " " + Dragon.getSize());
        System.out.println(Goose.getName() + " " + "is" + " " + Goose.getSize());
    }
}
