package aalekseenko.Lection3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        int Digital = sc.nextInt();

        for(int i = 2; i < (Digital-1); i++){
            if (Digital%i==0) counter++;
        }
if (counter == 0) {System.out.println("Введенное число простое");}
else {System.out.println("Введенное число не простое");}
    }
}
