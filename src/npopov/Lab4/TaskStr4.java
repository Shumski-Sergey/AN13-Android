package npopov.Lab4;

import java.util.Scanner;

public class TaskStr4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество слов: ");
        int n = scanner.nextInt();
        String[] strArray = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите слово: ");
            strArray[i] = scanner.next();
            System.out.print("");
        }
        for (String s : strArray) {
            if ((s.chars().distinct().count()) == 1) {   //.chars().distinct().count() нашёл в интернете
                System.out.println(s);
            } else {
                System.out.println("Во всех словах есть повторения символов");
            }
            break;
        }
    }
}
