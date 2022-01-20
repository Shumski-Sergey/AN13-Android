package ibagritsevich.lection_6.Clothes.Jacket;

public class AdidasJacket implements IJacket {

    public AdidasJacket() {
    }

    @Override
    public void PutOn(){
        System.out.println("Надета куртка Adidas");
    }

    @Override
    public void TakeOff(){
        System.out.println("Снята куртка Adidas");
    }
}