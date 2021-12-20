package vabramchuk.Lab9;


import java.io.*;

class Lab9_3 {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\vabramchuk\\lab9\\lab9_3.txt");
        FileWriter fw = new FileWriter(file, false);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Если хотите закончить запись наберите: ESC");
        String str;
        do {
            str = br.readLine();
            fw.write(str, 0, str.length());
            fw.write("\n");
        }
        while (!str.equals("esc"));
        fw.close();
        br.close();

    }
}
