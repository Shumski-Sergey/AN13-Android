package aalekseenko.Lection9;

import java.io.*;
import java.util.Arrays;

/*
Ввести с консоли имя файла. Найти байт или байты с максимальным количеством повторов.
Вывести их на экран через пробел. Закрыть поток ввода-вывода.
 */

// C:\Users\User\IdeaProjects\AN13-Android\src\aalekseenko\Lection9\Test_in.txt

public class Task1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите имя файла: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream file = new FileInputStream(fileName);
        byte[] arrayByte = new byte[file.available()];
        try {
            while (file.read() != -1){
                file.read(arrayByte);
            }
            System.out.println("Байт прочитано из файла: " + arrayByte.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        file.close();
        Arrays.sort(arrayByte);
        for (byte temp: arrayByte) {
            System.out.print(temp + " ");
        }
        int countByteMax = 0;
        int byteMax = 0;
        for (int i = 0; i < arrayByte.length - 1; i++) {
            int count = 1;
            for (int j = i; j < arrayByte.length - 1; j++) {
                if (arrayByte[j] == arrayByte[j + 1]) {
                    count++;
                    i = j;
                } else {
                    i = j;
                    break;
                }
            }
            if (count > countByteMax){
                countByteMax = count;
                byteMax = arrayByte[i];
            }
            if (i == arrayByte.length - 2) {
                System.out.println();
                System.out.println("Максимальное количество повторов у байта" + byteMax + ", он повторяется " + countByteMax + " раз");}
        }
    }
}


