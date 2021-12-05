package lkovsher.Lab5.TaskA1;

public class Turntable extends AudioVideoTechnique{
    int numberPorts;

    public Turntable(String firm, float price, int sound, int numberPorts) {
        super(firm, price, sound);
        this.numberPorts = numberPorts;
    }

    public int getNumberPorts() {
        return numberPorts;
    }

    public void socket(int flag){
        if(flag == 1){
            System.out.println("Устройство проигрователь включено в розетку.");
        } else if(flag == 0){
            System.out.println("Устройство проигрователь отключено от розетки.");
        }
    }
}
