package lkovsher.Robot;

import lkovsher.Robot.hands.SamsungHand;
import lkovsher.Robot.hands.SonyHand;
import lkovsher.Robot.hands.ToshibaHand;
import lkovsher.Robot.heads.SamsungHead;
import lkovsher.Robot.heads.SonyHead;
import lkovsher.Robot.heads.ToshibaHead;
import lkovsher.Robot.legs.SamsungLeg;
import lkovsher.Robot.legs.SonyLeg;
import lkovsher.Robot.legs.ToshibaLeg;

import java.util.stream.IntStream;

public class Run {
    public static void main(String[] args) {
        SamsungLeg samsungLeg = new SamsungLeg(200);
        SamsungHead samsungHead = new SamsungHead(100);
        SamsungHand samsungHand = new SamsungHand(750);

        SonyHand sonyHand = new SonyHand(800);
        SonyHead sonyHead = new SonyHead(200);
        SonyLeg sonyLeg = new SonyLeg(100);

        ToshibaLeg toshibaLeg = new ToshibaLeg(450);
        ToshibaHead toshibaHead = new ToshibaHead(950);
        ToshibaHand toshibaHand = new ToshibaHand(850);

        Robot robotOne = new Robot(toshibaHead, sonyHand, samsungLeg);
        robotOne.action();
        Robot robotSecond = new Robot(samsungHead, toshibaHand, sonyLeg);
        robotSecond.action();
        Robot robotThird = new Robot(sonyHead, samsungHand, toshibaLeg);
        robotThird.action();

        if (robotOne.getPrice() > robotSecond.getPrice() && robotOne.getPrice() > robotThird.getPrice()) {
            System.out.println("Самый дорогой первый робот, его стоимость: " + robotOne.getPrice());
        }else if(robotSecond.getPrice() > robotOne.getPrice() && robotSecond.getPrice() > robotThird.getPrice()){
            System.out.println("Самый дорогой второй робот, его стоимость: " + robotSecond.getPrice());
        } else  System.out.println("Самый дорогой третий робот, его стоимость: " + robotThird.getPrice());

        System.out.println(IntStream.of(robotOne.getPrice(),robotSecond.getPrice(),robotThird.getPrice()).reduce(Math::max));

    }
}
