package kvitko.Lab6_7.Computer;

import java.util.Scanner;

/*Создать класс компьютер.
        Поля:
        - процессор
        - оперативка
        - жесткий диск
        - ресурс полных циклов работы (включений/выключений)
        Методы:
        - метод описание(вывод всех полей)
        - метод включить, при включении может произойти сбой, при вывзове метода
        рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если
        угадали комп выключается, если нет сгорает.Если комп сгорел, при попытке
        включить нужно выдать сообщение что ему конец
        - выключить (аналогично включению)
        - при превышении лимита ресурса комп сгорает
*/
public class Computer {
    String Processor, HardDisk;
    int RAM, Resource;

    public Computer(String Processor, int RAM, String HardDisk, int Resource) {
        this.Processor = Processor;
        this.RAM = RAM;
        this.HardDisk = HardDisk;
        this.Resource = Resource;
    }

    public String getProcessor() {
        return Processor;
    }

    public String getHardDisk() {
        return HardDisk;
    }

    public int getResource() {
        return Resource;
    }

    public int getRAM() {
        return RAM;
    }

    public void displayinfo() {
        System.out.println("Processor: " + getProcessor() + " RAM: " + getRAM() + " HardDisk: " + getHardDisk() + " Resource: " + getResource());
    }

    public int TurnOn() {
        return (int) (Math.random() * 2);
    }
    public int TurnOff() {
        return (int) (Math.random() * 2);
    }

}
