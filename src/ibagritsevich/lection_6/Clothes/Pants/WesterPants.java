package ibagritsevich.lection_6.Clothes.Pants;

public class WesterPants implements IPants {

    public WesterPants() {
    }

    @Override
    public void PutOn(){
        System.out.println("Надеты штаны Wester");
    }

    @Override
    public void TakeOff(){
        System.out.println("Сняты штаны Wester");
    }
}