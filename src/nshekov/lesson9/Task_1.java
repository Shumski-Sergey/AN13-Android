package nshekov.lesson9;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите имя файла:");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        DataInputStream file = new DataInputStream(new FileInputStream(fileName));
        byte[] array = new byte[file.available()];
        try {
            while (file.read() != -1){
                file.read(array);
            }
            System.out.println(array.length + " доступных для чтения байт");
        } catch (IOException e) {
            e.printStackTrace();
        }
        file.close();
        Arrays.sort(array);
        for (byte a: array) {
            System.out.print(a + " ");
        }
        System.out.println();
        int coutMax = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int cout = 1;
            for (int j = i; j < array.length - 1; j++) {
                if (array[j] == array[j + 1]) {
                    cout++;
                    i = j;
                } else {
                    i = j;
                    break;
                }
            }
            if (cout > coutMax){
                coutMax = cout;
            }
        }
        for (int i = 0; i < array.length - 1; i++) {
            int cout = 1;
            for (int j = i; j < array.length - 1; j++) {
                if (array[j] == array[j + 1]) {
                    cout++;
                    i = j;
                    if (cout == coutMax){
                        System.out.println("Байт " + array[i] + " повторяется " + coutMax + " раз(а)");
                    }
                } else {
                    i = j;
                    break;
                }
            }
        }
    }
}

//  D:\Программы\Koding\AN13-Android\src\nshekov\lesson9\Robot.java
//   D:\Музыка\МОИ ТРЕКИ\wav\BDSM\Стоп-слово.txt
