package kvitko.Lab9;
// Ввести с консоли имя файла.
// Найти байт или байты с максимальным количеством повторов.
// Вывести их на экран через пробел.
// Закрыть поток ввода-вывода.
/*C:\Users\ser\Desktop\text.txt*/

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String filename = scanner.nextLine();
        DataInputStream fl = new DataInputStream(new FileInputStream(filename));
        byte[] arr=new byte[fl.available()];
        try{
            while (fl.read()!=-1)
                fl.read();
            System.out.println("Available for reading "+arr.length+ " bytes");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Arrays.sort(arr);
        fl.close();
        for(byte f: arr)
            System.out.print(f+ " ");

        System.out.println();
        int NumberMax = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int Number = 1;
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] == arr[j + 1]) {
                    Number++;
                    i = j;
                } else {
                    i = j;
                    break;
                }
            }
            if (Number > NumberMax){
                NumberMax = Number ;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int Number = 1;
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] == arr[j + 1]) {
                    Number++;
                    i = j;
                    if (Number == NumberMax){
                        System.out.println("Byte " + arr[i] + " repeats " + NumberMax + " times");
                    }
                } else {
                    i = j;
                    break;
                }
            }
        }

    }
}
