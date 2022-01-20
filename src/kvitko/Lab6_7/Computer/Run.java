package kvitko.Lab6_7.Computer;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        int resource=0;
        Computer Computer= new Computer("Intel I5", 32, "SSD", 2);
        Computer.displayinfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 0 or 1: ");
        int k = scanner.nextInt();
        if (k != 1 && k != 0) System.out.println("Wrong input!");
        else if (Computer.TurnOn() == k) {
            System.out.println("Computer was turned off");
            resource++;
        } else System.out.println("Computer was burned");

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter 0 or 1: ");
        int m = scanner1.nextInt();
        if (m != 1 && m != 0) System.out.println("Wrong input!");
        else if (Computer.TurnOff() == m) {
            System.out.println("Computer was turned on");
            resource++;
        } else System.out.println("Computer was burned");

        if(resource== Computer.getResource()) System.out.println("Resource is crowded. Computer was burned");
    }
}
