package vabramchuk.Lab9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Lab9_2 {
    public static void main(String[] args) {
        File file = new File("src\\vabramchuk\\lab9\\lab9_2.txt");
        File fileInfo = new File("src\\vabramchuk\\Lab9");
        SimpleDateFormat sdf = new SimpleDateFormat("dd.LLLL.yyyy HH:mm:ss EEEE  G ");
        File[] files = fileInfo.listFiles();
        try {
            FileWriter writer = new FileWriter(file, false);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            assert files != null;
            for (File s : files) {
                bufferWriter.write(s.getPath() + "\t" + sdf.format(s.lastModified()) + "\n");
            }
            bufferWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Файл записан");
    }
}



