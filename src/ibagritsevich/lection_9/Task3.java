package ibagritsevich.lection_9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\files\\Strings.txt");
        FileWriter fw = new FileWriter(file, false);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        System.out.println("Введите строки текста:");
        System.out.println("Введите '#ESC' для завершения.");
        String s = null;
        while (true) {
            try {
                s = br.readLine();
                fw.write(s,0,s.length());
                fw.write("\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
            assert s != null;
            if (s.equals("#ESC")) break;
            list.add(s);
        }
        fw.close();
        br.close();
        System.out.println(file + " - файл записан");
    }
}
