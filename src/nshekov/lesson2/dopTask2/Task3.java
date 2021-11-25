package nshekov.lesson2.dopTask2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
        StringBuffer number = new StringBuffer(sc.nextLine());
        for (int i = number.length(); i > 0; i--) {
            int couter = number.length() - i;
            if (couter % 4 == 0){
                number.insert(i, " ");
            }
        }
        System.out.println(number);
    }
}
