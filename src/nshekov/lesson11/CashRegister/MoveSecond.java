package nshekov.lesson11.CashRegister;

public class MoveSecond implements Runnable{

    Queue queue;

    public MoveSecond(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            queue.second();
        }
    }
}
