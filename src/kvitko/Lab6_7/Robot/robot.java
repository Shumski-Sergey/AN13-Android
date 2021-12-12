package kvitko.Lab6_7.Robot;
 /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

public class robot {
    String name, action;

    public robot(String name) {
        this.name = name;
    }

    public void action(String action) {
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public String getAction() {
        return action;
    }
}


