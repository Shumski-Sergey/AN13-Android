package nshekov.lesson11.Parking;

public class Car implements Runnable {
    ParkingPlace parkingPlace;
    private final int timeOfParking;
    private final String nameCar;

    public Car(ParkingPlace parkingPlace, String nameCar, int timeOfParking) {
        this.parkingPlace = parkingPlace;
        this.nameCar = nameCar;
        this.timeOfParking = timeOfParking * 1000;
    }

    @Override
    public void run() {
        if (parkingPlace.isFree()){
            parkingPlace.placeToTake(nameCar);
            try {
                Thread.sleep(timeOfParking);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            parkingPlace.placeToFree(nameCar);
        }else parkingPlace.placeToTake(nameCar);
    }
}
