package asemiakin.lab6.task1;

public class Main {
    public static void main(String[] args) {
        Clothes shorts = new Clothes("Шорты", 20);
        Clothes tshirt = new Clothes("Футболка", 25);
        Clothes cap = new Clothes("Кепка", 10);
        shorts.buy();
        shorts.wear();
        tshirt.wear();
        tshirt.sell();
        cap.buy();
        cap.wear();
    }
}
