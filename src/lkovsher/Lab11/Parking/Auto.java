package lkovsher.Lab11.Parking;


public class Auto implements Runnable {

    private final Parking plase1 = new Parking(1, true);
    private final Parking plase2 = new Parking(2, true);
    private final Parking plase3 = new Parking(3, false);


    @Override
    public void run() {
        synchronized (this) {
            while (!(plase1.isPlase()) && !(plase2.isPlase()) && !(plase3.isPlase())) {
                System.out.println(Thread.currentThread().getName() + " Wait the plase ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("The plase is vacated " + plase3.getPlaseNumber());
                plase3.setPlase(true);
            }


            if (plase1.isPlase()) {
                System.out.println(Thread.currentThread().getName() + " Plase was found: " + plase1.getPlaseNumber());
                plase1.setPlase(false);
            } else if (plase2.isPlase()) {
                System.out.println(Thread.currentThread().getName() + " Plase was found: " + plase2.getPlaseNumber());
                plase2.setPlase(false);
            } else if (plase3.isPlase()) {
                System.out.println(Thread.currentThread().getName() + " Plase was found: " + plase3.getPlaseNumber());
                plase3.setPlase(false);
            }


        }
    }
}

