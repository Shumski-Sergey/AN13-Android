package epavlyutin.pack7;

import java.util.Random;
import java.util.Scanner;

public class Compucter {
    private String CPU;
    private String RAM;
    private String HDD;
    private int result;
    private int limit = 3;

    public Compucter(String CPU, String RAM, String HDD) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public int getResult() {
        return result;
    }
    public void print(){
        System.out.println("CPU".concat(getCPU()).concat("RAM").concat(getRAM()).concat("HDD").concat(getHDD()));
    }
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int max = 1;
    int min = 0;
    int randomInt = (int) (Math.random() * ((max - min) + 1)) + min;


    public void compOn() {
        System.out.println("Для включения компьютера - введи число 0 или 1");
        int me1 = scanner.nextInt();
        if (randomInt == me1) {
            result += 1;
            System.out.println("Компьютер включен");
        } else if (result > limit){
            result += 1;
            System.out.println("Компьютер сгорел");
        }else {
            result += 1;
            System.out.println("Компьютер сгорел");
        }
    }
    public void compOff(){

        System.out.println("Для выключения компьютера - введи число 0 или 1");
        int me1 = scanner.nextInt();
        if (randomInt == me1) {
            result += 1;
            System.out.println("Компьютер выключен");
        } else if (result > limit){
            result += 1;
            System.out.println("Компьютер сгорел");
        }else {
            result += 1;
            System.out.println("Компьютер сгорел");
        }
    }
    public void infoResult(){
        System.out.println(getResult());
    }
}

