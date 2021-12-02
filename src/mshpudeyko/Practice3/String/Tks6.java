package mshpudeyko.Practice3.String;

import java.util.Scanner;

/*
*  Ввести n слов с консоли. Найти слово, символы в котором идут в стро-гом порядке возрастания их кодов.
*  Если таких слов несколько, найти первое из них.
* */
public class Tks6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int number = scanner.nextInt();
        String[] strings = new String[number];
        boolean flag=true;
        for (int i = 0; i < number; i++) {
            System.out.print("Enter word № " + (i + 1) + " : ");
            strings[i] = scanner.next();
        }
        for(int i=0;i<number;i++){
            int count=0;
            for(int j=0;j<strings[i].length()-1;j++){
                if((int)strings[i].charAt(j)<(int)strings[i].charAt(j+1)) {
                    count++;
                }
            }
            if(count==strings[i].length()-1){
                System.out.println("Word in which the characters are in strict ascending" +
                        " order of their codes: "+strings[i]);
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Word whose characters are in strict ascending " +
                    "order of their codes was not found");
        }
    }
}
