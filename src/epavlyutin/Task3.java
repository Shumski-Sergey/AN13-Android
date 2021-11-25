package epavlyutin;

public class Task3 {
    public static void main(String[] args) {
        int a = 13;
        if (a % 2 == 0){
            a++;
            System.out.println(a);
        }else {
            a =  a / 2;
            System.out.println((float) a);
        }
    }
}
