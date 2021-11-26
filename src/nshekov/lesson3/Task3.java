package nshekov.lesson3;

public class Task3 {
    public static void main(String[] args) {
        int array[] = new int[15];
        int cout = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 99);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0){
                cout++;
            }
        }
        System.out.println("\n" + cout + " is positive numbers");
    }
}
