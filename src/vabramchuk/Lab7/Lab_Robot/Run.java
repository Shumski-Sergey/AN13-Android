package vabramchuk.Lab7.Lab_Robot;

import vabramchuk.Lab7.Lab_Robot.hands.SamsungHand;
import vabramchuk.Lab7.Lab_Robot.hands.SonyHand;
import vabramchuk.Lab7.Lab_Robot.hands.ToshibaHand;
import vabramchuk.Lab7.Lab_Robot.heads.SamsungHead;
import vabramchuk.Lab7.Lab_Robot.heads.SonyHead;
import vabramchuk.Lab7.Lab_Robot.heads.ToshibaHead;
import vabramchuk.Lab7.Lab_Robot.legs.SamsungLeg;
import vabramchuk.Lab7.Lab_Robot.legs.SonyLeg;
import vabramchuk.Lab7.Lab_Robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        Robot yarik = new Robot(new SamsungHead(), new SonyHand(), new ToshibaLeg(), "Yarik");
        Robot guchi = new Robot(new SonyHead(), new ToshibaHand(), new SamsungLeg(), "Gychi");
        Robot Sharik = new Robot(new ToshibaHead(), new SamsungHand(), new SonyLeg(), "Sharik");
        yarik.FinalRobot();
        guchi.FinalRobot();
        Sharik.FinalRobot();

        Robot[] expensive = {yarik, guchi, Sharik};
        int max = 0;
        int x = 0;
        for (int i = 0; i < expensive.length - 1; i++) {
            if (expensive[i].getPrice() > max) {
                max = expensive[i].getPrice();
                x = i;
            }
        }
        System.out.println("Робот ".concat(expensive[x].getName()).concat(" самый дорогой и стоит:  ") + max + " У.Е.");

    }
}
