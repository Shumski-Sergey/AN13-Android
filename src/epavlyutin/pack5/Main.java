package epavlyutin.pack5;

public class Main {
    public static void main (String[] args) {
        iceBox hh = new iceBox(true,"Самсунг",2,"Холодильник");
        System.out.println(hh.name + hh.getFirm() + ", Количество дверей " + hh.getDoor() + ", Подходит для кухни " + hh.isForKitchen());
        hh.socket();
        Microwave microwave = new Microwave(true,"LG",1,"Микроволновка");
        System.out.println(hh.name + hh.getFirm() + ", Количество дверей " + hh.getDoor() + ", Подходит для кухни " + hh.isForKitchen());
        microwave.socket();
        vacumCleaner soska = new vacumCleaner(false,"Xiaomi",1,"Пылесос");
        System.out.println(hh.name + hh.getFirm() + ", Количество дверей " + hh.getDoor() + ", Подходит для кухни " + hh.isForKitchen());
        soska.socket();

    }
}
