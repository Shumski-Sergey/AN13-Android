package vabramchuk.Lab5.Task1A;

public class Camera extends Parametri {
    int camera;

    public Camera(String mobile, double summ, String operation, int yadro, int ram, int camera) {
        super(mobile, summ, operation, yadro, ram);
        this.camera = camera;
    }

    public int getCamera() {
        return camera;
    }
    public void infodispley(){
        System.out.println("\n Название мобильного:  " + getMobile() + "\n Стоимлость:  " + getSumm() + "\n Операционная система: " + getOperation_sys()
        + "\n Количество ядер:  " + getYadro() + "\n Оперативная память: " + getRam() + "\n Камера:  " + getCamera());
    }
}
