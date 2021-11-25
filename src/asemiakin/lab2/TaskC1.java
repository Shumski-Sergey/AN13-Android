package asemiakin.lab2;

public class TaskC1 {
    private static double convertCelsiumToFahrenheit(int celsium) {
        return ((celsium*9/5) + 32);
    }
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(40));
    }
}
