package vabramchuk.Lab5.Task1A;

public class Operation_sys extends Mobile {
    String operation;

    public Operation_sys(String mobile, double summ, String operation) {
        super(mobile, summ);
        this.operation = operation;
    }

    public String getOperation_sys() {
        return operation;
    }

    public void info(int i) {
        if (i == 1) {
            System.out.println("Телефон стоит на зарядке");
        } else if (i == 0) {
            System.out.println("Телефон отключен от зарядки");

        }
    }
}
