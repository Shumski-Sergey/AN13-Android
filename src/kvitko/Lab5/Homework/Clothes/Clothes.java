package kvitko.Lab5.Homework.Clothes;

import java.util.Scanner;

public class Clothes implements Movable, Sellable, Discountable {
    public double price1, price2, price3, discount;
    public  double price_1, price_2, price_3;

    public Clothes(double price1, double price2, double price3, double discount) {
        this.price1 = price1;
        this.price2 = price2;
        this.price3 = price3;
        this.discount = discount;
    }

    public void wear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите одежду которую вы хотите надеть:");
        System.out.println("1-майка");
        System.out.println("2-штаны");
        System.out.println("3-кроссовки");
        int k = scanner.nextInt();
        switch (k) {
            case 1:
                System.out.println("Вы надели майку");
                break;
            case 2:
                System.out.println("Вы надели штаны");
                break;
            case 3:
                System.out.println("Вы надели кроссовки");
                break;
            default:
                System.out.println("Неверный ввод!");
                break;
        }
    }

    @Override
    public void sell() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите одежду которую вы хотите продать:");
        System.out.println("1-майка");
        System.out.println("2-штаны");
        System.out.println("3-кроссовки");
        int k = scanner.nextInt();
        switch (k) {
            case 1:
                System.out.print("Введите цену: ");
                price_1 = scanner.nextDouble();
                System.out.println("Вы продали майку за " + price_1);
                break;
            case 2:
                System.out.print("Введите цену: ");
                price_2 = scanner.nextDouble();
                System.out.println("Вы продали штаны за " + price_2);
                break;
            case 3:
                System.out.println("Введите цену: ");
                price_3 = scanner.nextDouble();
                System.out.println("Вы продали кроссовки за " + price_3);
                break;
            default:
                System.out.println("Неверный ввод!");
                break;
        }
    }

    @Override
    public void buy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите одежду которую вы хотите купить со скидкой:");
        System.out.println("1-майка стоимостью " + price1 * ((100 - discount) / 100));
        System.out.println("2-штаны стоимостью " + price2 * ((100 - discount) / 100));
        System.out.println("3-кроссовки стоимостью " + price3 * ((100 - discount) / 100));
        int k = scanner.nextInt();
        switch (k) {
            case 1:
                System.out.println("Вы купили майку за " + price1 * ((100 - discount) / 100));
                break;
            case 2:
                System.out.println("Вы купили штаны за " + price2 * ((100 - discount) / 100));
                break;
            case 3:
                System.out.println("Вы купили кроссовки за " + price3 * ((100 - discount) / 100));
                break;
            default:
                System.out.println("Неверный ввод!");
                break;
        }
    }
}

