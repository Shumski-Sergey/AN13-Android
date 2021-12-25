package ibagritsevich.lection_2;

public class TaskB1 {
    public static void main(String[] args) {
        double d = 111.111;                // присваивание в десятичном формате
        byte b = 0b111;                    // присваивание в двоичном формате
        long o = 59L;                      // присваивание в восьмеричном формате
        int h = 627;                       // присваивание в шестнадцетеричном формате
        float f = 111.111F;                // присваивание в десятичном формате

        System.out.println("d = " + d);
        System.out.println("b = " + b);
        System.out.println("o = " + Long.toOctalString(o));
        System.out.println("h = " + Integer.toHexString(h));
        System.out.println("f = " + f);
    }
}
