package ibagritsevich.lection_9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("D://files", "NewFile.txt");
        File filepath = new File("D://files");
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy 'время' hh:mm:ss");
        try {
            FileWriter fw = new FileWriter(file, false);
            BufferedWriter bf = new BufferedWriter(fw);
            bf.write("путь " + filepath + " дата " + formatForDateNow.format(dateNow) + " имя " + file.getName());
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Файл записан");
    }
}
