package nshekov.lesson6.Task2;

public class Task2 {
    public static void main(String[] args) {
        Goose goose = new Goose("гусь", 24);
        goose.getSize();
        Dragon dragon = new Dragon("дракон", 244);
        dragon.getSize();
    }
}

abstract class BigAnimal {
    String type;
    int size;

    public BigAnimal(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public abstract void getSize();
}

abstract class SmallAnimal {
    String type;
    int size;

    public SmallAnimal(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public abstract void getSize();
}

class Goose extends SmallAnimal{
    public Goose(String type, int size) {
        super(type, size);
    }

    @Override
    public void getSize() {
        System.out.println("Маленький " + this.type.concat(" размером " + this.size + " y.e"));
    }
}

class Dragon extends BigAnimal{
    public Dragon(String type, int size) {
        super(type, size);
    }

    @Override
    public void getSize() {
        System.out.println("Большой " + this.type.concat(" размером " + this.size + " y.e"));
    }
}