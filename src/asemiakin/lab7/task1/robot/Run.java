package asemiakin.lab7.task1.robot;

import asemiakin.lab7.task1.robot.hands.*;
import asemiakin.lab7.task1.robot.heads.*;
import asemiakin.lab7.task1.robot.legs.*;

public class Run {
    public static void main(String[] args) {
        //robot 1 с головой от Sony за 40$, рукой от Samsung за 20$, ногой от Toshiba за 15$
        Robot robot1 = new Robot(new SonyHead(40), new SamsungHand(20), new ToshibaLeg(15));
        //robot 2 с головой от Samsung за 50$, рукой от Toshiba за 10$, ногой от Sony за 20$
        Robot robot2 = new Robot(new SamsungHead(50), new ToshibaHand(10), new SonyLeg(20));
        //robot 3 с головой от Toshiba за 30$, рукой от Sony за 25$, ногой от Samsung за 30$
        Robot robot3 = new Robot(new ToshibaHead(30), new SonyHand(25), new SamsungLeg(30));
        robot1.action();
        System.out.println();
        robot2.action();
        System.out.println();
        robot3.action();
        System.out.println();
        if (robot1.getPrice() > robot2.getPrice() && robot1.getPrice() > robot3.getPrice()) {
            System.out.println("Самым дорогим является первый робот");
        } else if (robot2.getPrice() > robot3.getPrice()) {
            System.out.println("Самым дорогим является второй робот");
        } else {
            System.out.println("Самым дорогим является третий робот");
        }
    }
}
