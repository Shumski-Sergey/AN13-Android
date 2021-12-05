package lkovsher.Lab5.TaskA1;

public class Television extends AudioVideoTechnique{
    float screenDiagonal;
    float permission;

    public Television(String firm, float price, int sound, float screenDiagonal, float permission) {
        super(firm, price, sound);
        this.screenDiagonal = screenDiagonal;
        this.permission = permission;
    }

    public float getScreenDiagonal() {
        return screenDiagonal;
    }

    public float getPermission() {
        return permission;
    }
    public void socket(int flag){
        if(flag == 1){
            System.out.println("Устройство телевизор включено в розетку.");
        } else if(flag == 0){
            System.out.println("Устройство телевизор отключено от розетки.");
        }
    }

    void print(){
        System.out.println("Телевизор: " + " \n" + "Фирма: " + this.getFirm() + " \n" + "Стоимость: " + this.getPrice()
                + " \n" + "Параметр звука: " + this.getSound() + "\n" + "Диагональ: " + this.getScreenDiagonal() + "\n" +
                "Разрешение экрана: " + this.getPermission() + "\n");
    }
}
