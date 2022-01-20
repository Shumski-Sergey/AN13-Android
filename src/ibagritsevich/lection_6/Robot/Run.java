package ibagritsevich.lection_6.Robot;

import ibagritsevich.lection_6.Robot.hands.SamsungHand;
import ibagritsevich.lection_6.Robot.hands.SonyHand;
import ibagritsevich.lection_6.Robot.hands.ToshibaHand;
import ibagritsevich.lection_6.Robot.heads.SamsungHead;
import ibagritsevich.lection_6.Robot.heads.SonyHead;
import ibagritsevich.lection_6.Robot.heads.ToshibaHead;
import ibagritsevich.lection_6.Robot.legs.SamsungLeg;
import ibagritsevich.lection_6.Robot.legs.SonyLeg;
import ibagritsevich.lection_6.Robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args){

        Robot robot1 = new Robot(new SonyHead(), new  SamsungHand(), new SonyLeg(), "R2-D2");
        Robot robot2 = new Robot(new ToshibaHead(), new SonyHand(), new SamsungLeg(), "R4-P17");
        Robot robot3 = new Robot(new SamsungHead(), new ToshibaHand(), new ToshibaLeg(), "С-3PO");
        robot1.PrintPrice();
        robot2.PrintPrice();
        robot3.PrintPrice();
        robot1.RobotAction();
        robot2.RobotAction();
        robot3.RobotAction();

        String name = null;
        int max = 0;
        Robot[] rich = {robot1, robot2, robot3};
        for (Robot robot : rich) {
            if (robot.getPrice() > max) {
                max = robot.getPrice();
                name = robot.getName();
            }
        }
        System.out.println("\nСамый дорогой робот стоит,$: " + max + " - это " + name);
    }
}