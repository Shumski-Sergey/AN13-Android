package vikonnikova.lab7.Computer;

import java.util.Scanner;

public class Computer implements IComputer {
    private String Processor, HDD;
    private int RAM, LimitResourse;

    public String getProcessor() {
        return Processor;
    }

    public String getHDD() {
        return HDD;
    }

    public int getRAM() {
        return RAM;
    }

    public int getLimitResourse() {
        return LimitResourse;
    }

    public Computer(String processor, String HDD, int RAM, int limitResourse) {
        Processor = processor;
        this.HDD = HDD;
        this.RAM = RAM;
        LimitResourse = limitResourse;

    }

    @Override
    public void DisplayInfo() {
        System.out.println("Процессор: " + getProcessor() + "\n Оперативка: " + getRAM() + "\n Жесткий диск: " + getHDD() + "\n Ресурс циклов работы: " + getLimitResourse());
    }

    @Override
    public void TurnOn() {
        int random1 = (int) (Math.random() * 2);
        System.out.println("Для включения введите 0 или 1");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (random1 == a) {
            System.out.println("Компьютер включен");
        }
        else {
            System.out.println("Компьютер сгорел");
        }
        LimitResourse++;
    }

    @Override
    public void TurnOff() {
        int random2 = (int) (Math.random() * 2);
        System.out.println("Для выключения введите 0 или 1");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        if (random2 == b) {
            System.out.println("Компьютер выключен");
        }
        else {
            System.out.println("Компьютер сгорел");
        }
        LimitResourse++;
    }

    @Override
    public void LimitResourse() {
        int Resourse = 10;
        if (Resourse < LimitResourse) {
            System.out.println("Компьютер сгорел");
    }
}
}
