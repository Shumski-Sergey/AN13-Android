package ibagritsevich.lection_6.Clothes.Pants;

public class FilaPants implements IPants {

    public FilaPants() {
    }

    @Override
    public void PutOn(){
        System.out.println("Надеты штаны Fila");
    }

    @Override
    public void TakeOff(){
        System.out.println("Сняты штаны Fila");
    }
}