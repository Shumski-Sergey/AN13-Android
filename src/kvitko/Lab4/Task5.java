package kvitko.Lab4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        String[] str = new String[n];
        char[] arr;
        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку №" + (i + 1) + ": ");
            str[i] = scanner1.nextLine();
        }
        int num_lat = 0, index = 0,vovel=0, consonant=0, count=0;
        for (int i = 0; i < n; i++) {
            if (str[i].matches("[a-zA-Z]+")) {
                index = i;
                num_lat++;
                arr = str[index].toCharArray();
                for(int j=0;j<arr.length; j++){
                    if(arr[j]=='a'||arr[j]=='e'||arr[j]=='i'||arr[j]=='o'||arr[j]=='u'||arr[j]=='y'||
                            arr[j]=='A'||arr[j]=='E'||arr[j]=='I'||arr[j]=='O'||arr[j]=='U'||arr[j]=='Y')
                        vovel++;
                    else consonant++;
                    if(vovel==consonant) count++;
                }

            }
        }
        System.out.print("Слов на латинском: "+num_lat);
        System.out.println();
        System.out.print("Из них с равным числом гласных и согласных: "+count);
    }
}
