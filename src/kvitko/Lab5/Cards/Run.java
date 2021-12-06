package kvitko.Lab5.Cards;

public class Run {
    public static void main(String[] args) {
        Card1 Card1 = new Card1("plastic", "Belarusbank", "1234 5678 9123 4567", "KIRYL VITKO ", "styding");
        Card1 Card2 = new Card1("plastic", "Belinvestbank", "1254 5378 9234 4167", "INSTANT CARD", "business");
        Card1 Card3 = new Card1("plastic", "Sberbank", "1111 2222 3333 4444", "INSTANT CARD", "business");
        System.out.println("Card material: "+Card1.getMaterial()+" Bank: "+Card1.getBank()+ "   Card Number: "+Card1.getNumber()+ " User name: "+Card1.getName()+ " For What: "+Card1.getForWhat());
        System.out.println("Card material: "+Card2.getMaterial()+" Bank: "+Card2.getBank()+ " Card Number: "+Card2.getNumber()+ " User name: "+Card2.getName()+ " For What: "+Card2.getForWhat());
        System.out.println("Card material: "+Card3.getMaterial()+" Bank: "+Card3.getBank()+ " \t   Card Number: "+Card3.getNumber()+ " User name: "+Card3.getName()+ " For What: "+Card3.getForWhat());
    }
}
