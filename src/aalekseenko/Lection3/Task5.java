package aalekseenko.Lection3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Digital = sc.nextInt();
        for(int i = 1; i < (Digital+1); i++){
            if (Digital%i==0) System.out.println(i);
        }
    }
}
