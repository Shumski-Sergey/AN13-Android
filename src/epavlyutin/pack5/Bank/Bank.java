package epavlyutin.pack5.Bank;

public class Bank {
    private String bankName;
    private String colorCard;

    public Bank(String bankName, String colorCard) {
        this.bankName = bankName;
        this.colorCard = colorCard;
    }

    public String getBankName() {
        return bankName;
    }

    public String getColorCard() {
        return colorCard;
    }
}
