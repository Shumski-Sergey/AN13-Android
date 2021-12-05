package lkovsher.Lab5.TaskA1;

public class TaskA1 {
    public static void main(String[] args) {
          Television television = new Television("LG", 3400, 300, 345, 789);
          Turntable turntable = new Turntable("Vinyl", 2300, 780, 3 );
          System.out.println("Телевизор: " + " \n" + "Фирма: " + television.getFirm() + " \n" + "Стоимость: " + television.getPrice()
          + " \n" + "Параметр звука: " + television.getSound() + "\n" + "Диагональ: " + television.getScreenDiagonal() + "\n" +
          "Разрешение экрана: " + television.getPermission() + "\n");
          System.out.println("Проигрователь: " + " \n" +"Фирма: " + turntable.getFirm() + " \n" + "Стоимость: " + turntable.getPrice()
                + " \n" + "Параметр звука: " + turntable.getSound() + "\n" + "Количество портов: " + turntable.getNumberPorts() + "\n");
          turntable.socket(0);
          television.socket(1);
    }
}
