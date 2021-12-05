package lkovsher.Lab5.TaskA1;

public class TaskA1 {
    public static void main(String[] args) {
          Television television = new Television("LG", 3400, 300, 345, 789);
          Turntable turntable = new Turntable("Vinyl", 2300, 780, 3 );
          television.print();
          turntable.print();
          turntable.socket(0);
          television.socket(1);
    }
}
