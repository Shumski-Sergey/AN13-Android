package lkovsher.Lab5.TaskA1;

public class Appliances {
    String firm;
    float price;

    public Appliances(String firm, float price) {
        this.firm = firm;
        this.price = price;
    }

    public String getFirm() {
        return firm;
    }

    public float getPrice() {
        return price;
    }

    public void socket(int flag){
        if(flag == 1){
            System.out.println("Устройство включено в розетку.");
        } else if(flag == 0){
            System.out.println("Устройство отключено от розетки.");
        }
    }
}
