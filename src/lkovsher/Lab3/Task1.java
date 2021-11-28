package lkovsher.Lab3;

public class Task1 {
    public static void main(String[] args) {
        int j = 0;
        int[] array = new int[10];
        for( int i=0; i <= 9; i++, j+=2){
            array[i]= j+2;
            System.out.print(array[i]+ " ");
        }
        System.out.print("\n");
        for( int i=0; i <= array.length; i++ ){
            System.out.println(array[i]);
        }
    }
}
