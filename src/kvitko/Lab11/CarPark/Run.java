package kvitko.Lab11.CarPark;

public class Run {
    public static void main(String[] args) {

        Streams st = new Streams();

        Thread st1 = new Thread(st);
        Thread st2 = new Thread(st);
        Thread st3 = new Thread(st);

        st1.start();
        st2.start();
        st3.start();
    }
}