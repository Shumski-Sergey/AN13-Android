package epavlyutin.pack7.robot;

import epavlyutin.pack7.robot.Hand.SamsungHand;
import epavlyutin.pack7.robot.Hand.SonyHand;
import epavlyutin.pack7.robot.Hand.ToshibaHand;
import epavlyutin.pack7.robot.Head.SamsungHead;
import epavlyutin.pack7.robot.Head.SonyHead;
import epavlyutin.pack7.robot.Head.ToshibaHead;
import epavlyutin.pack7.robot.Leg.SamsungLeg;
import epavlyutin.pack7.robot.Leg.SonyLeg;
import epavlyutin.pack7.robot.Leg.ToshibaLeg;
import epavlyutin.pack7.robot.Robot;

public class Run {
    public static void main(String[] args) {
        Robot Chatti = new Robot(new SonyHead(), new SamsungHand(), new ToshibaLeg(), "Chatti");
        Robot Leon = new Robot(new SamsungHead(), new ToshibaHand(), new SonyLeg(), "Leon");
        Robot Rahnar = new Robot(new ToshibaHead(), new SonyHand(), new SamsungLeg(), "Rahnar");
        Chatti.overPrise();
        Leon.overPrise();
        Rahnar.overPrise();

        Robot[] expensive = {Chatti, Leon, Rahnar};
        int max = 0;
        int name = 0;
        for (int i = 0; i < expensive.length - 1; i++) {
            if (expensive[i].getPrice() > max) {
                max = expensive[i].getPrice();
                name = i;
            }
        }
        System.out.println("Робот ".concat(expensive[name].getName()).concat(" дороже остальных"));
    }
}
