package nshekov.lesson11.CashRegister;

public class MoveFirst implements Runnable{
    Queue queue;

    public MoveFirst(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            queue.first();
        }
    }
}
