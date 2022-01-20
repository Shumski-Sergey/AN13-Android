package lkovsher.Lab11.CollSentre;


public class Run {
    public static void main(String[] args) {
        Client client = new Client();

        Thread client1 = new Thread(client);
        Thread client2 = new Thread(client);
        Thread client3 = new Thread(client);
        client1.start();
        client2.start();
        client3.start();
    }
}
