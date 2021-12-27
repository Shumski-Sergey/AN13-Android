package nshekov.lesson11.Parking;

class ParkingPlace {
    private boolean free = true;
    private int numberPlace;

    public boolean isFree() {
        return free;
    }

    public ParkingPlace(int numberPlace) {
        this.numberPlace = numberPlace;
    }

    public synchronized void placeToTake(String nameCar){
        while(!free){
            try {
                System.out.println(numberPlace + " место занято ");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(nameCar + " занял место №" + numberPlace);
        free = false;
    }
    public synchronized void placeToFree(String nameCar){
        System.out.println(nameCar + " освободил место №" + numberPlace);
        free = true;
        notify();
    }
}
