package ryancharuk.LabSeven.HomeWorksRobot;

import ryancharuk.LabSeven.HomeWorksRobot.hands.SamsungHand;
import ryancharuk.LabSeven.HomeWorksRobot.hands.SonyHand;
import ryancharuk.LabSeven.HomeWorksRobot.hands.ToshibaHand;
import ryancharuk.LabSeven.HomeWorksRobot.heads.SamsungHead;
import ryancharuk.LabSeven.HomeWorksRobot.heads.SonyHead;
import ryancharuk.LabSeven.HomeWorksRobot.heads.ToshibaHead;
import ryancharuk.LabSeven.HomeWorksRobot.legs.SamsungLeg;
import ryancharuk.LabSeven.HomeWorksRobot.legs.SonyLeg;
import ryancharuk.LabSeven.HomeWorksRobot.legs.ToshibaLeg;
import ryancharuk.LabSeven.HomeWorksRobot.robot.Robot;

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

        Robot Andre = new Robot(new ToshibaHead(22), new SamsungHand(21), new SamsungLeg(10),"Andre");
        Robot Sergio = new Robot(new SamsungHead(20), new SonyHand(23), new ToshibaLeg(13),"Sergio");
        Robot Bender = new Robot(new SonyHead(19), new ToshibaHand(17), new SonyLeg(18),"Bender");

        Andre.action();
        Sergio.action();
        Bender.action();

        Andre.sort(Bender,Andre,Sergio);

    }
}
