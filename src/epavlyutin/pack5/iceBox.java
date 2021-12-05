package epavlyutin.pack5;

public class  iceBox extends houseHold {
    String name;

    public iceBox(boolean forKitchen,String firm, int door, String name) {
        super(forKitchen, firm, door);
        this.name = name;
    }


    public  void socket(){
     System.out.println(name + " включён в резетку");
 }
    }


