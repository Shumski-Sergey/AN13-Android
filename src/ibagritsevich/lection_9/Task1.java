package ibagritsevich.lection_9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String filename = scanner.next();
        FileInputStream fis = new FileInputStream(filename);
        byte[] bytes = new byte[fis.available()];
        try {
            while ((fis.read()) != -1) {
                fis.read();
            }
            System.out.print("\nДлина байтового массива: " + bytes.length + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        Scanner text = new Scanner(new File(filename));
        while (text.hasNextLine()) {
            System.out.println(text.nextLine());
        }
        fis.close();

        byte[] fileBytes = Files.readAllBytes(Path.of(filename));
        System.out.println("Массив байтов: " + Arrays.toString(fileBytes));

        Map<Byte, Integer> count = new HashMap<>();
        for (byte fileByte : fileBytes) {
            if (count.containsKey(fileByte)) {
                count.put(fileByte, count.get(fileByte) + 1);
            } else {
                count.put(fileByte, 1);
            }
        }
        for (Map.Entry<Byte, Integer> entry : count.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Повторяющийся байт : " + entry.getKey() + " " + entry.getValue() + " раза");
            }
        }
    }
}