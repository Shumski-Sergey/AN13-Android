package lkovsher.Lab9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String text = scanner.nextLine();
        try(FileOutputStream file = new FileOutputStream("C:\\Users\\Liz\\notes.txt"))
        {
            byte[] buffer = text.getBytes();
            file.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
    }
}
