package ibagritsevich.lection_6.Clothes.Jacket;

public class NikeJacket implements IJacket {

    public NikeJacket() {
    }

    @Override
    public void PutOn(){
        System.out.println("Надета куртка Nike");}

    @Override
    public void TakeOff(){
        System.out.println("Снята куртка Nike");}
}