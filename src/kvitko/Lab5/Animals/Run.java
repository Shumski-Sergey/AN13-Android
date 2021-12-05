package kvitko.Lab5.Animals;

public class Run {
    public static void main(String[] args) {
        BigAnimal drag=new Dragon("Дракон ", "большого");
        SmallAnimal goose=new Goose("Гусь ", "маленького");
        System.out.println(drag.getAnimal()+drag.getSize()+" размера");
        System.out.println(goose.getAnimal()+goose.getSize()+" размера");
    }
}
