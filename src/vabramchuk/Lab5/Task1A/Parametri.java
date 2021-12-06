package vabramchuk.Lab5.Task1A;

public class Parametri extends Operation_sys{
     int yadro;
     int ram;

    public Parametri(String mobile, double summ, String operation, int yadro, int ram) {
        super(mobile, summ, operation);
        this.yadro = yadro;
        this.ram = ram;
    }

    public int getYadro() {
        return yadro;
    }

    public int getRam() {
        return ram;
    }
}
