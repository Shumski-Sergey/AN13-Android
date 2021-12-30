package lkovsher.Lab11.CollSentre;

public class CollSentre {

    private int operator;

    public synchronized void get() {
        while (operator < 1) {
            try {
                System.out.println(Thread.currentThread().getName() + " Ожидает...");
                wait();
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
        operator--;
        System.out.println(Thread.currentThread().getName() +  " Заняли одного оператора");
        System.out.println("Операторов свободных: " + operator);
        notify();
        while (operator >= 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
        operator++;
        System.out.println(Thread.currentThread().getName() +  " Освободился 1 оператор");
        System.out.println("Операторов свободных: " + operator);
        notify();
    }



    public CollSentre(int operator) {
        this.operator = operator;
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }
}

