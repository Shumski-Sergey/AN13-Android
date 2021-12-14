package nshekov.lesson7.Task4_Compucter;

public class Runner {
    public static void main(String[] args) {
        Computer c1 = new Computer( "Intel1", 8, 8, 98);
        Computer c2 = new Computer( "Intel2", 16, 8, 980);
        Computer c3 = new Computer( "Intel3", 32, 8, 9800);
        c1.action();
        c2.action();
        c3.action();
        c1.action();
        c2.action();
        c3.action();
    }
}
