package kvitko.Lab3.Homework;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        if(n>3){
            int a[] = new int[n];
            for (int i = 0; i < a.length; i++)
                a[i] = (int) (Math.random() * n);

            for (int i : a)
                System.out.print(i + " ");

            System.out.println();

            int number=0;
            for (int i = 0; i < a.length; i++)
                if(a[i]%2==0) number++;
                if(number==0) System.out.println("В массиве нет чётных элементов");
                else {int b[] = new int[number];
                    int j = 0;
                    for (int i = 0; i < a.length; i++)
                            if (a[i] % 2 == 0) {
                                b[j] = a[i];
                                j++;
                            }
                    for(int f:b) System.out.print(f+" ");
                }

        }
        else System.out.println("Неверное число");
    }
}
