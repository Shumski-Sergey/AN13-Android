package aalekseenko.Lection5.TaskA2;

public class Runner {
    public static void main(String[] args) {
        CreditCard masterCard = new MasterCard("Aleksei", "Belarusbank", "MasterCard");
        DebitCard salaryCard = new SalaryCard("Vasja", "BigBablo", "salaryCard");

        System.out.println(masterCard.getPaymentSystem());
        System.out.println(salaryCard.getOwner());

        masterCard.displayInfo();
        salaryCard.displayInfo();
    }
}
