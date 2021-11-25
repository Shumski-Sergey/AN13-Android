package kvitko.Lab2.Homework;

import java.util.Scanner;

public  class Lab2_task_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.println(a+b+" "+(a-b)+" "+a*b+" "+a/b+" "+a%b);
        System.out.println((double)a+b+" "+(double)(a-b)+" "+(double)a*b+" "+(double)a/b+" "+(double)a%b);

        System.out.println("--------------------");

        String A="Я помню чудное мгновенье:";
        String B="Передо мной явилась ты,";
        String C="Как мимолетное виденье,";
        String D="Как гений чистой красоты.";
        String E="В томленьях грусти безнадежной,";
        String F="В тревогах шумной суеты,";
        String G="Звучал мне долго голос нежный";
        String H="И снились милые черты.";

        System.out.println("Мое любимое стихотворение:");
        System.out.println(A+"\n"+B+"\n"+C+"\n"+D+"\n"+E+"\n"+F+"\n"+G+"\n"+H);
    }
}



