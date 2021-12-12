package vikonnikova.lab7.Robot;

import vikonnikova.lab7.Robot.hands.SamsungHand;
import vikonnikova.lab7.Robot.hands.SonyHand;
import vikonnikova.lab7.Robot.hands.ToshibaHand;
import vikonnikova.lab7.Robot.heads.SamsungHead;
import vikonnikova.lab7.Robot.heads.SonyHead;
import vikonnikova.lab7.Robot.heads.ToshibaHead;
import vikonnikova.lab7.Robot.legs.SamsungLeg;
import vikonnikova.lab7.Robot.legs.SonyLeg;
import vikonnikova.lab7.Robot.legs.ToshibaLeg;

public class Run {

    public static void main(String[] args) {
    Robot Robot1 = new Robot (new SonyHead(), new SamsungHand(), new ToshibaLeg(), "Robot1");
    Robot Robot2 = new Robot (new SamsungHead(), new ToshibaHand(), new SonyLeg(), "Robot2");
    Robot Robot3 = new Robot (new ToshibaHead(), new SonyHand(), new SamsungLeg(), "Robot3");

    Robot1.action();
    Robot1.getPrice();
        System.out.println("Робот 1 стоит: " + Robot1.getPrice());

    Robot2.action();
    Robot2.getPrice();
        System.out.println("Робот 2 стоит: " + Robot2.getPrice());

    Robot3.action();
    Robot3.getPrice();
        System.out.println("Робот 3 стоит: " + Robot3.getPrice());

    if (Robot1.getPrice() > Robot2.getPrice() && Robot1.getPrice() > Robot3.getPrice())
        System.out.println("Робот 1 самый дорогой");
    else if (Robot2.getPrice() > Robot1.getPrice() && Robot2.getPrice() > Robot3.getPrice())
        System.out.println("Робот 2 самый дорогой");
    else if (Robot3.getPrice() > Robot1.getPrice() && Robot3.getPrice() > Robot2.getPrice())
        System.out.println("Робот 3 самый дорогой");
    else
        System.out.println("Ошибка");
    }
}
