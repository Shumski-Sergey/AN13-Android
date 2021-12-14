package aalekseenko.Lection7.Robot.src.by.teachmeskills.robot;

import aalekseenko.Lection7.Robot.src.by.teachmeskills.robot.hands.SamsungHand;
import aalekseenko.Lection7.Robot.src.by.teachmeskills.robot.hands.SonyHand;
import aalekseenko.Lection7.Robot.src.by.teachmeskills.robot.hands.ToshibaHand;
import aalekseenko.Lection7.Robot.src.by.teachmeskills.robot.heads.IHead;
import aalekseenko.Lection7.Robot.src.by.teachmeskills.robot.heads.SamsungHead;
import aalekseenko.Lection7.Robot.src.by.teachmeskills.robot.heads.SonyHead;
import aalekseenko.Lection7.Robot.src.by.teachmeskills.robot.heads.ToshibaHead;
import aalekseenko.Lection7.Robot.src.by.teachmeskills.robot.legs.SamsungLeg;
import aalekseenko.Lection7.Robot.src.by.teachmeskills.robot.legs.SonyLeg;
import aalekseenko.Lection7.Robot.src.by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {

    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
SonyHead sonyHead = new SonyHead(100);
SonyLeg sonyLeg = new SonyLeg(70);
SonyHand sonyHand = new SonyHand(50);
SamsungHead samsungHead = new SamsungHead(120);
SamsungLeg samsungLeg = new SamsungLeg(80);
SamsungHand samsungHand = new SamsungHand(90);
ToshibaHand toshibaHand = new ToshibaHand(40);
ToshibaLeg toshibaLeg = new ToshibaLeg(110);
ToshibaHead toshibaHead = new ToshibaHead(130);

Robot robot1 = new Robot(samsungHead, sonyHand, toshibaLeg);
Robot robot2 = new Robot(sonyHead, toshibaHand, samsungLeg);
Robot robot3 = new Robot(toshibaHead, samsungHand, sonyLeg);

robot1.action();
robot2.action();
robot3.action();


if ((robot1.getPrice() > robot2.getPrice()) & (robot1.getPrice() > robot3.getPrice())) {System.out.println("Самый дорогой робот 1");}
else if ((robot2.getPrice() > robot1.getPrice()) & (robot2.getPrice() > robot3.getPrice())) {System.out.println("Самый дорогой робот 2");}
else {System.out.println("Самый дорогой робот 3");}
    }
}
