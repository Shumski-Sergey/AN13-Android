package ibagritsevich.lection_5.TaskA2;

public class AboutCard {
    public static void main(String[] args){
        VisaInfinite visaInfinite = new VisaInfinite("Дебетовая", "Артем Солдатенко", "ВТБ",
                "Visa", "06/22",4177531148859780L, 220,3);
        AlfaCredit alfaCredit = new AlfaCredit("Кредитная","Дмитрий Сергеев", "Альфа-Банк",
                "Mastercard","07/23", 125676534356431L,5000, 0.1,30);
        visaInfinite.CardInfo();
        alfaCredit.CardInfo();
    }
}
