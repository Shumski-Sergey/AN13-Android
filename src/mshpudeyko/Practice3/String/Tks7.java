package mshpudeyko.Practice3.String;

import java.util.Scanner;

/*
* Ввести n слов с консоли.
* Найти слово, состоящее только из различных символов.
*  Если таких слов несколько, найти первое из них.
* */
public class Tks7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int number = scanner.nextInt();
        boolean flag=true;
        String[] strings = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter word № " + (i + 1) + " : ");
            strings[i] = scanner.next();
        }
        for(int i=0;i<number;i++){
            int count=0;
            for(int j=0;j<strings[i].length()-1;j++) {
                for(int k=j;k<strings[i].length()-1;k++){
                    if((int) strings[i].charAt(j) == (int) strings[i].charAt(k+1)){
                        count++;
                    }
                }
            }
            if(count==0){
                System.out.print("Word consisting only of various symbols: "+strings[i]);
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Word consisting only of various symbols was not found");
        }
    }
}
