package epavlyutin.pack5;

public class vacumCleaner extends houseHold {
    String name;
    public vacumCleaner(boolean forKitchen,String firm, int door, String name) {
        super(forKitchen, firm, door);
        this.name = name;
    }

    public void socket(){
        System.out.println(name + " Включён в резетку");
    }
}
