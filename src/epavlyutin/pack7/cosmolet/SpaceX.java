package epavlyutin.pack7.cosmolet;

import java.util.Scanner;

public class SpaceX implements IStart {
    public void Alcogol() {
        System.out.println("Проверка количества алкоголя в крови пилота");
    }

    @Override
    public boolean preStart() {
        int promile = (int) (Math.random() * 4);
        return promile <= 2;

    }

    @Override
    public void engineStarting() {
        System.out.println("В пилоте всего пару шотов \n Он смог запутить двигатель");

    }

    @Override
    public void start() {
        System.out.println("SpaseX запущен!");

    }
}
