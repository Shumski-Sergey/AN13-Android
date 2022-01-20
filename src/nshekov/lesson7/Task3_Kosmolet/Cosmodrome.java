package nshekov.lesson7.Task3_Kosmolet;

class Cosmodrome {

    private IStart start;

    public Cosmodrome(IStart start) {
        this.start = start;
    }

    public void starting(){
        if (!start.prestart()){
            System.out.println("Предстартовая проверка провалена\n");
        } else {
            start.engineStarting();
            for (int i = 10; i > 0; i--) {
                System.out.print(i + "\t");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            System.out.println();
            start.start();
            System.out.println();
        }
    }
}
