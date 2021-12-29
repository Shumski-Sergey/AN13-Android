package nshekov.lesson11.CallCenter;

import java.util.ArrayList;
import java.util.Arrays;

public class RunnerCall {
    public static void main(String[] args) {
        Operator first = new Operator("Первый", true);
        Operator second = new Operator("Второй", true);
        ArrayList<Operator> operators = new ArrayList<>(Arrays.asList(first, second));
        Client john = new Client("John", 1000);
        Client joe = new Client("Joe", 2000);
        Client tom = new Client("Tom", 3000);

        CallCenter c1 = new CallCenter(john, operators);
        CallCenter c2 = new CallCenter(joe, operators);
        CallCenter c3 = new CallCenter(tom, operators);

        new Thread(c1).start();
        new Thread(c2).start();
        new Thread(c3).start();
    }
}
