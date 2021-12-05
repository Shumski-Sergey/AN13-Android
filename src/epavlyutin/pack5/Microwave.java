package epavlyutin.pack5;

public class Microwave extends houseHold {
    String name;

    public Microwave(boolean forKitchen,String firm, int door, String name) {
        super(forKitchen, firm, door);
        this.name = name;
    }

    public void socket() {
        System.out.println(name + " не включён в резетку");
    }
}
