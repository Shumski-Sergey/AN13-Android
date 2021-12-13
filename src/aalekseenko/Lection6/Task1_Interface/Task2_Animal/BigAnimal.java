package aalekseenko.Lection6.Task1_Interface.Task2_Animal;

public class BigAnimal {
    String size;

    public BigAnimal(String size){
        this.size = size;
    }

    public String getSize() { return size; }

    public void displayInfo(){
        System.out.println("Размер животного " + size);
    }

}
