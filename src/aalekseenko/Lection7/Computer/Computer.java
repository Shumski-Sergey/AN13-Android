package aalekseenko.Lection7.Computer;

import java.util.Scanner;

public class Computer implements IComputer{
    String cpu;
    String ram;
    String hdd;
    int limitOnOff;
    int limit;

    public Computer(String cpu, String ram, String hdd, int limitOnOff ) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.limitOnOff = limitOnOff;
        this.limit = 0;
    }

    @Override
    public void descriptionComputer() {
        System.out.println("Описание компьютера");
        System.out.println("Процессор: " + this.cpu);
        System.out.println("Оперативная память: " + this.ram);
        System.out.println("Жесткий диск: " + this.hdd);
        System.out.println("Лимит включений/выключений: " + this.limitOnOff);
        System.out.println();
    }

    @Override
    public void turnOn() {
        byte a = 0;
        byte b = 2;
        int randomNumber = a + (int) (Math.random() * b);
        System.out.println("Введите 0 или 1");
        Scanner keyboard = new Scanner(System.in);
        int keyboardNumber = keyboard.nextInt();
        if ((keyboardNumber == 0)|(keyboardNumber == 1)){
            if (keyboardNumber == randomNumber) {
                System.out.println("Комп включился");
                this.limit++; }
            else System.out.println("Комп сгорел");
        } else {
            System.out.println("Введены некорректные данные! Повторите сначала, введите 0 или 1");
        }
    }

    @Override
    public void turnOff() {
        byte a = 0;
        byte b = 2;
        int randomNumber = a + (int) (Math.random() * b);
        System.out.println("Введите 0 или 1");
        Scanner keyboard = new Scanner(System.in);
        int keyboardNumber = keyboard.nextInt();
        if ((keyboardNumber == 0)|(keyboardNumber == 1)){
            if (keyboardNumber == randomNumber) {
                System.out.println("Комп выключился");
                this.limit++; }
            else System.out.println("Комп сгорел");
        } else {
            System.out.println("Введены некорректные данные! Повторите сначала, введите 0 или 1");
        }
    }

    @Override
    public void computerBurnsOut() {
        int temp = (int)Math.floor((this.limit)/2);
        if (temp > this.limitOnOff) {System.out.println("Лимит ресурса включений/выключений превышен, комп сгорел");}
    }
}
