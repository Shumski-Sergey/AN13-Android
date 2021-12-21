package ibagritsevich.lection_6.Clothes.Pants;

public class NordwayPants implements IPants {

    public NordwayPants() {
    }

    @Override
    public void PutOn(){
        System.out.println("Надеты штаны Nordway");
    }

    @Override
    public void TakeOff(){
        System.out.println("Сняты штаны Nordway");
    }
}