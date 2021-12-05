package mshpudeyko.Practice4.Tks2;
import java.util.Scanner;
import java.lang.String;
/*
* Рядом с мышью — и гусь велик, но вот рядом с драконом...
*  В этой задаче у нас будут гуси (класс Goose) и драконы (класс Dragon).
*  А также их предки, классы BigAnimal или SmallAnimal, кто чей предок — догадайтесь сами.
* Затем переопределите для Goose и Dragon метод String getSize(), так,
* чтобы они выводили строки о размере животного.
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter size of dragon: ");
        int dragonSize= scanner.nextInt();
        BigAnimal dragon=new BigAnimal(dragonSize);
        System.out.print("Size of dragon: "+dragon.getSize()+"\n");
        System.out.print("Enter size of goose: ");
        int gooseSize= scanner.nextInt();
        SmallAnimal goose=new SmallAnimal(gooseSize);
        System.out.print("Size of goose: "+goose.getSize()+"\n");

    }
}
