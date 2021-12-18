package nshekov.lesson9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Task_2 {
    public static void main(String[] args) {
        File file = new File("D:\\Программы\\Koding\\AN13-Android\\src\\nshekov\\lesson9", "Task_2.txt");
        File fileInfo = new File("D:\\Программы\\Koding\\AN13-Android\\src\\nshekov\\lesson9");   //проверяемая папка
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        String [] files = fileInfo.list();
        try {
            FileWriter writer = new FileWriter(file, false);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            for (String a: files) {
                    bufferWriter.write(fileInfo.getPath() + "\t" + a + "\t" + sdf.format(fileInfo.lastModified()) + "\n");
            }
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Информация записана");
    }
}
