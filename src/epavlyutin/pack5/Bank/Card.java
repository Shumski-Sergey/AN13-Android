package epavlyutin.pack5.Bank;

public class Card extends Bank {
    private String nameCard; // подсвечивает цветом, уточняет не финал ли - нет, не финал
    private String cardNumber;

    public Card(String bankName, String colorCard, String nameCard, String cardNumber) {
        super(bankName, colorCard);
        this.nameCard = nameCard;
        this.cardNumber = cardNumber;
    }

    public String getNameCard() {
        return nameCard;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void print() {
        int zp = (int) (Math.random() * 3);
        if (zp > 0) {
            System.out.println("Приехал любимый зять, бежим пить пиво");
        } else {
            System.out.println("Используем овердрафт, потому что приехал любимый зять, надо бежать пить пиво");
        }

    }
}
