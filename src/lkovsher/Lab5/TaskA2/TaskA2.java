package lkovsher.Lab5.TaskA2;

public class TaskA2 {
    public static void main(String[] args) {
          GoldVisaCard goldVisaCard = new GoldVisaCard(123456789876L, " Ivan Ivanov", 3000, 2.5);
          CreditCard creditCard = new CreditCard(3456789012345678L, "Olga Ivanova" , 15);
          goldVisaCard.print();
          System.out.println();
          creditCard.print();
    }
}
