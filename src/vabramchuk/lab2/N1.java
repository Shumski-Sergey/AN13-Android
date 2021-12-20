package vabramchuk.lab2;
import java.util.Scanner;
public class N1{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Введи месяц года:  ");
            int day = sc.nextInt();
            if (day == 1){System.out.println("январь");}
            else if (day == 2){System.out.println("февраль");}
            else if (day == 3){System.out.println("март");}
            else if (day == 4){System.out.println("апрель");}
            else if (day == 5){System.out.println("май");}
            else if (day == 6){System.out.println("июнь");}
            else if (day == 7){System.out.println("июль");}
            else if (day == 8){System.out.println("август");}
            else if (day == 9){System.out.println("сентябрь");}
            else if (day == 10){System.out.println("октябрь");}
            else if (day == 11){System.out.println("ноябрь");}
            else if (day == 12){System.out.println("декабрь");}
        }
}