package asemiakin.lab7.task3;

import java.util.Random;

public interface IStart {
    Random random = new Random();
    int MAX_GENERATED_NUMBER = 10, MIN_GENERATED_NUMBER = 0;

    default int generateNumber() {
        return random.nextInt(MAX_GENERATED_NUMBER - MIN_GENERATED_NUMBER + 1) + MIN_GENERATED_NUMBER;
    }

    default boolean prelaunchSystemCheck() {
        return generateNumber() > 3;
    }

    void startEngine();

    void generalStart();
}
