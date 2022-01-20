package aalekseenko.Lection9;

import java.io.*;

/* Организовать построчное считывание данных, введенных с консоли, и их запись в файл.
Признаком окончания записи (конец работы программы) является строка со словом «#ESC». */

public class Task3 {
    public static void main(String[] args) throws IOException {
        try {
        File file = new File("C:/Users/User/IdeaProjects/AN13-Android/src/aalekseenko/Lection9/Task_3.txt");
        FileWriter writer = new FileWriter(file, false);
        System.out.println("Вводите строки, для завершения введите ESC");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while (true) {
            str = reader.readLine();
            if (str.equals("ESC")) { break; }
            writer.write(str, 0, str.length());
            writer.write("\n");
        }
        writer.flush();
        writer.close();
        reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
