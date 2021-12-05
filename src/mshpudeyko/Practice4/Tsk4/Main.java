package mshpudeyko.Practice4.Tsk4;

/*
* .Создать иерархию классов, описывающих банковские карточки.
Иерархия должна иметь хотя бы три уровня.
* */
public class Main {
    public static void main(String[] args) {
        BelagrapromBank card1 = new Color("BelagrapromBank", "5555 4455 4555 5445", "09/22", "Yellow", "KIRILL VITKO");
        card1.print();
        BelagrapromBank card2 = new OwnerName("BelagrapromBank", "5555 5555 5555 5555", "12/23", "Gold", "MAXIM SHPUDZEIKA");
        card2.print();
        BelarusBank card3=new Type("BelarusBank","1515 1515 1516 1617","03/22","VISA","Yes");
        card3.print();
        BelarusBank card4=new Contact("BelarusBank","4200 1326 1567 8888","09/23","MasterCard","No");
        card4.print();
    }
}
