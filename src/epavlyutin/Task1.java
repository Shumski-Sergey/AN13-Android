package epavlyutin;

public class Task1 {
    public static void main(String[] args) {
        int a = 123;
        int lenght = (int) (Math.log10(a) + 1);
        if (lenght > 1 && a % 2 == 0) {
            System.out.println("Это не однозначное положительное число");
        } else if (lenght > 1 && a % 2 != 0) {
            System.out.println("Это не однозначное отрицательное число");
        } else if (lenght <= 1 && a % 2 != 0) {
            System.out.println("Это однозначное отрицательное число");
        } else {
            System.out.println("Это однозначное положительное число");
        }

    }
}