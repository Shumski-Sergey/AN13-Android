package nshekov.lesson7.Task4_Compucter;

import java.util.Scanner;

public class Computer implements ComputerInfo {

    private String processor;
    private int ram;
    private int hdd;
    private int resourceLimit;
    private int turn = 0;

    public Computer(String processor, int ram, int hdd, int resourceLimit) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.resourceLimit = resourceLimit;
    }

    @Override
    public void action() {
        displayInfo();
        resourceLimit();
        if (turn == 1) {
            System.out.println("Комп уже сгорел\n");
        } else {
            turnOn();
            if (turn == 1) {
                System.out.println("Компьютер сгорел при включении\n");
            } else turnOff();
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Процесор: " + processor
                + "\tОперативка: " + ram + " ГБ"
                + "\tЖесткий диск: " + hdd + " ГБ"
                + "\tОбщий ресурс: " + resourceLimit);
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void turnOn() {
        int rand = (int) (Math.random() * 2);
        System.out.println("Чтобы включить введите 1 или 0");
        if (sc.nextInt() == rand && turn != 1) {
            System.out.println("Комп включился");
        } else {
            turn = 1;
        }
    }

    @Override
    public void turnOff() {
        int rand = (int) (Math.random() * 2);
        System.out.println("Чтобы выключить введите 1 или 0");
        if (sc.nextInt() == rand && turn != 1) {
            System.out.println("Комп выключился");
        } else {
            System.out.println("Комп сгорел\n");
            turn = 1;
        }
    }

    @Override
    public void resourceLimit() {
        int resource = 1000;
        if (resource < resourceLimit) {
            System.out.println("Компьютер исчерпал лимит");
            turn = 1;
        }
    }

}
