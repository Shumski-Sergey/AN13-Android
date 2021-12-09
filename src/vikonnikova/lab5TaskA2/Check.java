package vikonnikova.lab5TaskA2;

public class Check {
    public static void main(String[] args) {
        CreditCard VisaCard = new VisaCard ("Name Surname; ", 1111,"Belagroprombank; ", "Visa");
        CreditCard MasterCard = new MasterCard ("Name Surname; ", 1111 ,"Belagroprombank; ", "MasterCard");
        DebitCard StudentCard = new StudentCard ("Name Surname; ", 1111 ,"Belagroprombank; ", "student");
        DebitCard SalaryCard = new SalaryCard ("Name Surname; ", 1111 ,"Belagroprombank; ", "salary");

        VisaCard.displayInfo();
        MasterCard.displayInfo();
        StudentCard.displayInfo();
        SalaryCard.displayInfo();

    }
}
