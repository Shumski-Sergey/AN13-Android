package nshekov.lesson11.CashRegister;

public class Runner {
    public static void main(String[] args) {
        Queue queue = new Queue();

        MoveFirst mf = new MoveFirst(queue);
        MoveSecond ms = new MoveSecond(queue);

        new Thread(mf).start();
        new Thread(ms).start();
    }
}
