package aalekseenko.Lection6.Task2_Animal;

public class SmallAnimal {
    String size;

    public SmallAnimal(String size) {
        this.size = size;
    }

    public String getSize() { return size; }

    public void displayInfo(){
        System.out.println("Размер животного " + size);
    }

}
