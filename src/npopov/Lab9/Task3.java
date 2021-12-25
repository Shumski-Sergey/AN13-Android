package npopov.Lab9;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File dir = new File("src\\npopov\\Lab9");
        File file = new File(dir, "Task_3.txt");
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            while (true) {
                String str = reader.readLine();
                if (str.equals("ESC")) {
                    writer.flush();
                    break;
                }
                writer.write(str + "\n");
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
