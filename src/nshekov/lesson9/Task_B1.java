package nshekov.lesson9;

import java.io.*;
import java.security.SecureRandom;

public class Task_B1 {

    static final String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz йцукенгшщзхъэждлорпавыфячсмитьбю ";
    static SecureRandom rnd = new SecureRandom();

    public static void main(String[] args) throws IOException {
        File file = new File("src\\nshekov\\lesson9\\Task_1B.txt");
        FileWriter fileRand = new FileWriter(file, false);
        FileReader fileRandRead = new FileReader(file);
        FileWriter cloneFile = new FileWriter("src\\nshekov\\lesson9\\Task_1B_clone.txt", false);
        System.out.println(randomString(1024));
        for (int i = 0; i < 1024 * 100; i++) {
            fileRand.write(randomString(1024));
            if (i % 1024 == 0){
                int cout = i / 1024;
                System.out.println(cout + " Мб сгенерировано");
            }
        }
        fileRand.close();
        int a;
        while ((a = fileRandRead.read()) != -1) {
            cloneFile.write(a);
        }
        fileRandRead.close();
        cloneFile.close();
    }

    public static String randomString(int len) {
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }
}
