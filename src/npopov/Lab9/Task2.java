package npopov.Lab9;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Objects;

public class Task2 {
    public static void main(String[] args) {
        File dir = new File("src\\npopov\\Lab9");
        File file = new File(dir, "Task_2.txt");
        DateFormat df = new SimpleDateFormat("dd MMM yyy");
        File[] files = dir.listFiles();
        try {
            Writer writer = new FileWriter(file, false);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (File s : Objects.requireNonNull(files)) {
                bufferedWriter.write(file.getParent() + " " + file.getName() + " " + df.format(s.lastModified()) + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
