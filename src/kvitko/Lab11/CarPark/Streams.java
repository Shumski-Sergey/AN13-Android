package kvitko.Lab11.CarPark;

import kvitko.Lab11.CarPark.CarPark;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams implements Runnable {

    CarPark car1 = new CarPark("Mercedes", false, 1);
    CarPark car2 = new CarPark("BMW", false, 1);
    CarPark car3 = new CarPark("Audi", false, 2);
    CarPark car4 = new CarPark("Ferrari", false, 2);
    List<CarPark> CarList = new ArrayList<>(Arrays.asList(car1, car2, car3, car4));

    @Override
    public void run() {
        CarPark car = CarList.get((int) (Math.random() * 4));
        while (car.getIsFree()) {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " " + car.getCarMark() + " wants to stop on the " + car.getParkNumber() + " park");
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
        }
        car.setIsFree(true);


        System.out.println(Thread.currentThread().getName() + " " + car.getCarMark() + " took place on the " + car.getParkNumber() + " park");
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

        car.setIsFree(false);

        run();

    }
}

