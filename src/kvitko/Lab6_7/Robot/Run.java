package kvitko.Lab6_7.Robot;
  /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

import kvitko.Lab6_7.Robot.IHand.Samsung_hand;
import kvitko.Lab6_7.Robot.IHand.Sony_hand;
import kvitko.Lab6_7.Robot.IHand.Toshiba_hand;
import kvitko.Lab6_7.Robot.IHead.Samsung_head;
import kvitko.Lab6_7.Robot.IHead.Sony_head;
import kvitko.Lab6_7.Robot.IHead.Toshiba_head;
import kvitko.Lab6_7.Robot.ILeg.Sony_leg;
import kvitko.Lab6_7.Robot.ILeg.Toshiba_leg;

public class Run {
    public static void main(String[] args) {
        robot Prototipe1 = new robot("Terminator");
        Samsung_head s_head1 = new Samsung_head("Samsung", "Speak", 2000);
        Toshiba_hand t_hand1 = new Toshiba_hand("Toshiba", "Move", 400);
        Sony_leg s_leg1= new Sony_leg("Sony", "Step", 500);
        System.out.println("Robot: " + Prototipe1.getName() + " Head: " + s_head1.getHead()+" Price: "+s_head1.getPrice() + " Hand: "+t_hand1.getHand()+
               " Price: "+t_hand1.getPrice() + " Leg: "+s_leg1.getLeg()+" Price: "+s_leg1.getPrice() + " Action: "+s_head1.getAction());

        robot Prototipe2 = new robot("Charlie");
        Sony_head s_head2 = new Sony_head("Sony", "Speak", 1000);
        Samsung_hand s_hand2 = new Samsung_hand("Samsung", "Move", 1900);
        Toshiba_leg t_leg2= new Toshiba_leg("Toshiba", "Step", 300);
        System.out.println("Robot: " + Prototipe2.getName() + " Head: " + s_head2.getHead()+" Price: "+s_head2.getPrice() + " Hand: "+s_hand2.getHand()+
                " Price: "+s_hand2.getPrice() + " Leg: "+t_leg2.getLeg()+" Price: "+t_leg2.getPrice() + " Action: "+s_hand2.getAction());

        robot Prototipe3 = new robot("Aboba");
        Toshiba_head t_head3 = new Toshiba_head("Toshiba", "Speak", 700);
        Sony_hand s_hand3 = new Sony_hand("Sony", "Move", 800);
        Sony_leg s_leg3= new Sony_leg("Sony", "Step", 700);
        System.out.println("Robot: " + Prototipe3.getName() + " Head: " + t_head3.getHead()+" Price: "+t_head3.getPrice() + " Hand: "+s_hand3.getHand()+
                " Price: "+s_hand3.getPrice() + " Leg: "+s_leg3.getLeg()+" Price: "+s_leg3.getPrice() + " Action: "+s_leg3.getAction());

        if(s_head1.getPrice()+ t_hand1.getPrice()+ s_leg1.getPrice()> s_head2.getPrice()+ s_hand2.getPrice()+ t_leg2.getPrice() &&
                s_head1.getPrice()+ t_hand1.getPrice()+ s_leg1.getPrice()>t_head3.getPrice()+s_hand3.getPrice()+s_leg3.getPrice())
            System.out.println("The most expensive robot is "+Prototipe1.getName()+" which costs "+s_head1.getPrice()+ t_hand1.getPrice()+ s_leg1.getPrice());
        else if(s_head1.getPrice()+ t_hand1.getPrice()+ s_leg1.getPrice()< s_head2.getPrice()+ s_hand2.getPrice()+ t_leg2.getPrice() &&
                s_head2.getPrice()+ s_hand2.getPrice()+ t_leg2.getPrice()>t_head3.getPrice()+s_hand3.getPrice()+s_leg3.getPrice())
            System.out.println("The most expensive robot is "+Prototipe2.getName()+" which costs "+(s_head2.getPrice()+ s_hand2.getPrice()+ t_leg2.getPrice()));
        else  System.out.println("The most expensive robot is "+Prototipe3.getName()+" which costs "+ t_head3.getPrice() +s_hand3.getPrice()+s_leg3.getPrice());
    }
}
