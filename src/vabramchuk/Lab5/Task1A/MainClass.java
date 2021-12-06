package vabramchuk.Lab5.Task1A;

public class MainClass {
    public static void main(String[] args) {
        Camera xiaomi = new Camera("Xiaomi", 500, "Android", 4, 6, 64);
        Camera apple = new Camera("Apple", 2500, "Ios",4, 6, 64);
        Camera samsung = new Camera("Samsung", 600,"Android", 4, 8, 128);
        xiaomi.infodispley();
        xiaomi.info(1);
        apple.infodispley();
        apple.info(0);
        samsung.infodispley();
        samsung.info(1);


    }
}
