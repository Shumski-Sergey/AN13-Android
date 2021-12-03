package mshpudeyko.Practice3.String;

import java.util.Scanner;

/*
* Ввести n слов с консоли. Среди слов, состоящих только из цифр, найти слово-палиндром.
* Если таких слов больше одного, найти второе из них.
* */
public class Tsk8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int number = scanner.nextInt();
        String[] strings = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter string № " + (i + 1) + " : ");
            strings[i] = scanner.next();
        }
        int count=0,temp=0,flag=0;
        for(int i=0;i<number;i++){
            if(strings[i].matches("[0-9]*")){
                int k=strings[i].length()-1;
                for(int j=0;j<=(strings[i].length()-1)/2;j++,k--){
                    if(strings[i].charAt(j)==strings[i].charAt(k)){
                        count++;
                    }
                }
                if(count==(strings[i].length()-1)/2);{
                    temp=i;
                    flag++;
                }
            }
            if(flag==2){
                System.out.print("Word-palindrome: "+strings[temp]);
                return;
            }
        }
        if(flag==0) {
            System.out.print("Word wasn't found");
            return;
        }
        System.out.print("Word-palindrome: "+strings[temp]);
    }
}
