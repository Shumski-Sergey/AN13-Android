package nshekov.lesson11.CallCenter;

import java.util.ArrayList;

public class CallCenter extends Thread {

    Client client;
    ArrayList<Operator> operators;

    public CallCenter(Client clients, ArrayList<Operator> op) {
        this.client = clients;
        this.operators = op;
    }

    @Override
    public void run() {
        Operator operator = operators.get((int) (Math.random() * operators.size()));
        long time = (long) (Math.random() * 5000);
        while (!operator.isIs_free()) {
            System.out.println(operator.getNumberOperator() + " оператор занят");
            if (client.getTimeWaiting() > time) {
                System.out.println(client.getName() + " ждет " + operator.getNumberOperator() + " оператора");
                try {
                    Thread.sleep(client.getTimeWaiting());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(client.getName() + " нужно ждать " + time + ", а он может только " + client.getTimeWaiting());
                System.out.println(client.getName() + " повесил трубку");
                interrupt();
                break;
            }
        }
        synchronized (this) {
            if (!isInterrupted()) {
                operator.setIs_free(false);
                System.out.println(operator.getNumberOperator() + " начал разговаривать с " + client.getName());
                try {
                    Thread.sleep(client.getTimeWaiting());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(operator.getNumberOperator() + " закончил разговаривать с " + client.getName());
                operator.setIs_free(true);
            }
        }
    }
}
