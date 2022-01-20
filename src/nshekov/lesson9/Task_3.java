package nshekov.lesson9;

import java.io.*;

public class Task_3 {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\nshekov\\lesson9\\Task_3.txt");
        FileWriter fw = new FileWriter(file, false);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Для завершения наберите: ESC");
        String str;
            do {
                str = br.readLine();
                fw.write(str, 0, str.length());
                fw.write("\r\n");
            }
            while (!str.equals("ESC"));
        fw.close();
        br.close();
        System.out.println(file.getParent());
    }
}
