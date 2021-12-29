package lkovsher.Lab9;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

//2.  Написать программу, которая создаст текстовый файл и запишет в него список файлов из заданного каталога.
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Liz\\Desktop\\БГУИР\\Доки_старстат");
        ArrayList<String> fileNames = new ArrayList<>();
        File[] listOfFiles = file.listFiles();
        try{
            FileOutputStream out = new FileOutputStream("C:\\Users\\Liz\\Res.txt");
            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    fileNames.add(listOfFiles[i].getName());
                    System.out.println(fileNames.get(i));
                    byte[] buffer = fileNames.get(i).getBytes();
                    out.write(buffer, 0, buffer.length);
                }
            }

        } catch(FileNotFoundException ex){
            ex.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
