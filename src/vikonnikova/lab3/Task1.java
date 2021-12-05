package vikonnikova.lab3;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[21];
        for (int i = 2; i <= 20; i = i + 2) {
            i = i + array[i];
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int i = 2; i <= 20; i = i + 2) {
            i = i + array[i];
            System.out.println(i + "  ");
        }

    }
}
