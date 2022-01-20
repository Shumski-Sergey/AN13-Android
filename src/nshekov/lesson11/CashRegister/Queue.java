package nshekov.lesson11.CashRegister;

public class Queue {
    int queue1;
    int queue2;

    public synchronized void first(){
        while (queue1 > 6){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue1 += (int) (Math.random() * 5);
        System.out.println("В первой очереди " + queue1 + " человек");
        if (queue2 > 0)
            queue2 -= (int) (Math.random() * 3);
        notify();
    }

    public synchronized void second(){
        while (queue1 <= 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue2 += (int) (Math.random() * 3);
        System.out.println("Во второй очереди " + queue2 + " человек");
        queue1 -= (int) (Math.random() * 3);
        notify();
    }
}
