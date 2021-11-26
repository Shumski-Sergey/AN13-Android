package aalekseenko.Lection3;

import java.util.Scanner;
public class Task3 {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args) {
        String Str = "";
        Scanner sc = new Scanner(System.in);
        int Digital = sc.nextInt();
        while (Digital>0) {
            int a = (int)Digital%1000;
            String Buf = Integer.toString(a);
            Buf = reverseString(Buf);
            Str += Buf+" ";
            Digital = (int)Math.floor(Digital/1000);

        }
        Str = reverseString(Str);
        System.out.print(Str+" ");
    }
}
