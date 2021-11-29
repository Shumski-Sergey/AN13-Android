package nshekov.lesson3;

public class Task5 {
    public static void main(String[] args) {
        int[] firstArray = new int[5];
        int[] secondArray = new int[5];
        double sred1 = 0, sred2 = 0;
        for (int i = 0; i < 5; i++) {
            firstArray[i] = (int) (Math.random() * 15);
            sred1 += firstArray[i];
            secondArray[i] = (int) (Math.random() * 15);
            sred2 += secondArray[i];
        }
        sred1 /= 5;
        sred2 /= 5;
        for (int a : firstArray){
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a : secondArray){
            System.out.print(a + " ");
        }
        System.out.println("\nСреднеарифметическое первого массива:\n" + sred1 + "\nСреднеарифметические второго массива:\n" + sred2);
        if (sred1 > sred2){
            System.out.println("Среднеарифметическое первого массива больше");
        } else if (sred1 < sred2){
            System.out.println("Среднеарифметическое второго массива больше");
        } else {
            System.out.println("Среднеарифметическое обоих массивов равно");
        }
    }
}
