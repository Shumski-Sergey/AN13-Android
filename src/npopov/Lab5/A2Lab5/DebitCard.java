package npopov.Lab5.A2Lab5;

public class DebitCard extends PaymentCard {

    private String money;

    DebitCard(String bankName, String paymentSystem, String cardNumber, String nameHolder, String surnameHolder) {
        super(bankName, paymentSystem, cardNumber, nameHolder, surnameHolder);
    }

    protected void print() {
        System.out.println("Банк: ".concat(getBankName()) + " " + "Платёжная система: ".concat(getPaymentSystem()) + "\n"
                + "Номер карты: ".concat(getCardNumber()) + "\n"
                + "Владелец: ".concat(getNameHolder()).concat(" ").concat(getSurnameHolder()));
    }

    protected String salary() {
        int count = (int) (Math.random() * 2);
        money = (count == 0) ? "В этом месяце вашу зп уменьшили" : "В этом месяце вашу зп увеличили";
        return money;
    }
}
