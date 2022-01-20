package lkovsher.Lab9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {

        try(FileInputStream fin = new FileInputStream("C:\\Users\\Liz\\not.txt");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Liz\\not_new.txt"))
        {
            byte[] buffer = new byte[fin.available()];
            fin.read(buffer, 0, buffer.length);
            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
