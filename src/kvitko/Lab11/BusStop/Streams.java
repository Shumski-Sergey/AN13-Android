package kvitko.Lab11.BusStop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams implements Runnable {
    Bus bus1 = new Bus(9768, 12, 2, false);
    Bus bus2 = new Bus(5511, 12,2, false);
    Bus bus3 = new Bus(7777, 14, 1,false);
    Bus bus4 = new Bus(1112, 14, 1,false);
    List<Bus> BusList = new ArrayList<>(Arrays.asList(bus1, bus2, bus3, bus4));

    public void run() {
        int number=0;
        Bus bus = BusList.get((int) (Math.random() * 4));
        if (bus.getBus_Stop_Number() == 12 && number<bus.getFree_Places()) {
        while (bus.getIsFree()) {
                synchronized (this) {
                    System.out.println(Thread.currentThread().getName() + " " + bus.getBus_Number() + " wants to stop on the " + bus.getBus_Stop_Number() + " bus stop");
                    try {
                        Thread.currentThread().join(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        while (bus.getIsFree()) {
            if (bus.getBus_Stop_Number() == 14) {
                synchronized (this) {
                    System.out.println(Thread.currentThread().getName() + " " + bus.getBus_Number() + " wants to stop on the " + bus.getBus_Stop_Number() + " bus stop");
                    try {
                        Thread.currentThread().join(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        bus.setIsFree(true);

        System.out.println(Thread.currentThread().getName() + " " + bus.getBus_Number() + " took place on the " + bus.getBus_Stop_Number() + " bus stop");
        if (bus.getBus_Stop_Number() == 12) {
            number++;
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
        number--;
        bus.setIsFree(false);
        run();
    }
}

