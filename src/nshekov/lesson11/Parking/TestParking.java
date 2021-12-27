package nshekov.lesson11.Parking;

import javax.swing.plaf.basic.BasicTreeUI;

public class TestParking {
    public static void main(String[] args) {
        ParkingPlace first = new ParkingPlace(1);
        ParkingPlace second = new ParkingPlace(2);
        Car audi = new Car(first, "Audi", 10);
        Car reno = new Car(second,"Reno",5);
        Car uaz = new Car(first,"UAZ",3);
        Car maz = new Car(first,"MAZ",3);
        Car maz1 = new Car(first,"MAZ1",3);

        new Thread(audi).start();
        new Thread(reno).start();
        new Thread(uaz).start();
        new Thread(maz).start();
        new Thread(maz1).start();
    }
}
