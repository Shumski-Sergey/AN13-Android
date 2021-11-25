package epavlyutin;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("Введите цифру");
        a = scanner.nextInt();
        if(a == 1){
            System.out.println(a + " програмист");
        }else if (a > 1 && a < 5){
            System.out.println(a + " програмиста");
        }else {
            System.out.println(a + " програмистов");
        }
    }
}
