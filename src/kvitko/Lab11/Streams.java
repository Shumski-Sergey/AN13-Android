package kvitko.Lab11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams implements Runnable {

    CarPark car1 = new CarPark("Mercedes", true, 1);
    CarPark car2 = new CarPark("BMW", true, 1);
    CarPark car3 = new CarPark("Audi", true, 2);
    CarPark car4 = new CarPark("Ferrari", true, 2);
    List<CarPark> CarList = new ArrayList<>(Arrays.asList(car1, car2, car3, car4));

    @Override
    public void run() {
        CarPark car = CarList.get((int) (Math.random() * 4));
        while (car.getIsFree()) {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " " + car.getCarMark() + " took place on the " + car.getParkNumber());
                try {
                    Thread.currentThread().join(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            car.setIsFree(false);
        }

        while (!car.getIsFree()) {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " " + car.getCarMark() + " made free place on the " + car.getParkNumber());
                if (car.getParkNumber() == 1) {
                    try {
                        Thread.currentThread().join(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        Thread.currentThread().join(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            car.setIsFree(true);
        }

        run();

    }
}

