package npopov.Lab7.Computer;

import java.util.Scanner;

public class Computer {

    private String cpu;
    private String ram;
    private String hdd;
    private int fullCycleLife;
    private boolean bol;

    public Computer(String cpu, String ram, String hdd, int fullCycleLife) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.fullCycleLife = fullCycleLife;
    }

    public void description() {
        System.out.println("Процессор: ".concat(cpu));
        System.out.println("Оперативка: ".concat(ram));
        System.out.println("Жесткий диск: ".concat(hdd));
        System.out.println("Ресурс полных циклов работы: " + fullCycleLife + "\n");
    }

    public void inclusion() {
        int count = 0;
        while (count < fullCycleLife) {
            int b = (int) (Math.random() * 2);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите 1 или 0, чтобы вкл компьютер: ");
            int a = scanner.nextInt();
            System.out.println("a: " + a + " b: " + b);
            if (a == b) {
                System.out.println("Компьютер включается\n");
                shutdown();
                if (bol) {
                    break;
                }
            } else {
                System.out.println("Компьютер сгорел");
                break;
            }
            count++;
        }
        limit(count);
    }

    public void shutdown() {
        int b = (int) (Math.random() * 2);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1 или 0, чтобы выкл компьютер: ");
        int a = scanner.nextInt();
        System.out.println("a: " + a + " b: " + b);
        if (a == b) {
            System.out.println("Компьютер выключается\n");
        } else {
            System.out.println("Компьютер сгорел");
            bol = true;
        }
    }

    public void limit(int count) {
        if (count == fullCycleLife) {
            System.out.println("Компьютер сгорел, так как лимит ресурса пк превышен");
        }
    }

    public String getCpu() {
        return cpu;
    }

    public String getHdd() {
        return hdd;
    }

    public int getFullCycleLife() {
        return fullCycleLife;
    }

    public String getRam() {
        return ram;
    }
}
