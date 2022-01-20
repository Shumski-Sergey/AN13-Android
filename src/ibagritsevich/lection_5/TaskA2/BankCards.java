package ibagritsevich.lection_5.TaskA2;

public class BankCards {

    private String type;
    private String owner;
    private String bank;
    private String payment_system;
    private String validity;
    private long number;

    public BankCards(String type, String owner, String bank, String payment_system, String validity, long number) {
        this.type = type;
        this.owner = owner;
        this.bank = bank;
        this.payment_system = payment_system;
        this.validity = validity;
        this.number = number;
    }

    public String getType() {return type;}
    public String getOwner() {return owner;}
    public String getBank() {return bank;}
    public String getPayment_system() {return payment_system;}
    public String getValidity() {return validity;}
    public long getNumber() {return number;}

    public void CardInfo(){
        System.out.println("\nВид банковской карты: " + getType() + "\nВладелец: " + getOwner() + "\nБанк: " + getBank()
                + "\nПлатежная система: " + getPayment_system() + "\nСрок действия карты: " + getValidity() + "\nНомер карты:" + getNumber());
    }

}
