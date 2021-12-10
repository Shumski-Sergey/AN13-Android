package nshekov.lesson7.Robot;

import nshekov.lesson7.Robot.Hand.SamsungHand;
import nshekov.lesson7.Robot.Hand.SonyHand;
import nshekov.lesson7.Robot.Hand.ToshibaHand;
import nshekov.lesson7.Robot.Head.SamsungHead;
import nshekov.lesson7.Robot.Head.SonyHead;
import nshekov.lesson7.Robot.Head.ToshibaHead;
import nshekov.lesson7.Robot.Leg.SonyLeg;
import nshekov.lesson7.Robot.Leg.SumsungLeg;
import nshekov.lesson7.Robot.Leg.ToshibaLeg;

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
        Robot robot1 = new Robot(new SonyHead(), new ToshibaHand(), new SumsungLeg(), "Саня");
        Robot robot2 = new Robot(new ToshibaHead(), new SamsungHand(), new SonyLeg(), "Виталя");
        Robot robot3 = new Robot(new SamsungHead(), new SonyHand(), new ToshibaLeg(), "Иннокентий Филимонович");
        robot1.action();
        System.out.println("Этот робот стоит " + robot1.getPrice() + " бананов\n");
        robot2.action();
        System.out.println("Этот робот стоит " + robot2.getPrice() + " бананов\n");
        robot3.action();
        System.out.println("Этот робот стоит " + robot3.getPrice() + " бананов\n");
        if (robot1.getPrice() > robot2.getPrice() && robot1.getPrice() > robot3.getPrice()){
            System.out.println(robot1.getName().concat(" самый дорогой"));
        } else if (robot2.getPrice() > robot1.getPrice() && robot2.getPrice() > robot3.getPrice()){
            System.out.println(robot2.getName().concat(" самый дорогой"));
        } else if (robot3.getPrice() > robot2.getPrice() && robot3.getPrice() > robot1.getPrice()){
            System.out.println(robot3.getName().concat(" самый дорогой"));
        } else{
            System.out.println("Есть роботы  одинаковой стоимостью");
        }
    }
}

