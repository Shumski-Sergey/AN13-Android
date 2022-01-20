package aalekseenko.Lection9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

/*
Написать программу, которая создаст текстовый файл и запишет в него список файлов (путь, имя, дата создания)
из заданного каталога.
 */

public class Task2 {
    public static void main(String[] args) {
        File checkDir = new File("C:/Users/User/IdeaProjects/AN13-Android/src/aalekseenko/Lection3");
        File myFile = new File("C:/Users/User/IdeaProjects/AN13-Android/src/aalekseenko/Lection9", "Task2.txt");
        SimpleDateFormat dateOfCreation = new SimpleDateFormat("dd.MM.yyyy");
        File [] allFiles = checkDir.listFiles();
        try
        {
            FileWriter writer = new FileWriter(myFile, false);
            assert allFiles != null;
            for (File temp: allFiles) {
                writer.write(temp.getAbsolutePath() + " " + temp.getName() + " " + dateOfCreation.format(temp.lastModified()) + "\n");
            }
            writer.flush();
            writer.close();
            System.out.println("Требуемая информация записана.");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
