package npopov.Lab7.Robot;

import npopov.Lab7.Robot.hands.SamsungHand;
import npopov.Lab7.Robot.hands.SonyHand;
import npopov.Lab7.Robot.hands.ToshibaHand;
import npopov.Lab7.Robot.heads.SamsungHead;
import npopov.Lab7.Robot.heads.SonyHead;
import npopov.Lab7.Robot.heads.ToshibaHead;
import npopov.Lab7.Robot.legs.SamsungLeg;
import npopov.Lab7.Robot.legs.SonyLeg;
import npopov.Lab7.Robot.legs.ToshibaLeg;

public class Run {

    public static void main(String[] args) {
        Robot robotNicolai = new Robot(new SamsungHead(), new SonyHand(), new ToshibaLeg(), "Nicolai");
        Robot robotDasha = new Robot(new SonyHead(), new ToshibaHand(), new SamsungLeg(), "Dasha");
        Robot robotAlex = new Robot(new ToshibaHead(), new SamsungHand(), new SonyLeg(), "Alex");
        robotNicolai.outPutRobot();
        robotDasha.outPutRobot();
        robotAlex.outPutRobot();

        Robot [] dearest = {robotNicolai, robotDasha, robotAlex};
        int max = 0;
        int ind = 0;
        for (int i = 0; i < dearest.length - 1; i++) {
            if (dearest[i].getPrice() > max) {
                max = dearest[i].getPrice();
                ind = i;
            }
        }
        System.out.println("Робот ".concat(dearest[ind].getName()).concat(" самый дорогой"));
    }
}
