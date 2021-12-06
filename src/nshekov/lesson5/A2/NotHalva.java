package nshekov.lesson5.A2;

public class NotHalva extends Cards {

    int procent;

    public NotHalva(String bank, String type, int number, int procent) {
        super(bank, type, number);
        this.procent = procent;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ежемесячно начисляется ".concat(Integer.toString(procent)).concat(" процентов"));
    }
}
