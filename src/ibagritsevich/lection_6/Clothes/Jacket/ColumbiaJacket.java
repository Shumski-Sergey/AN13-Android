package ibagritsevich.lection_6.Clothes.Jacket;

public class ColumbiaJacket implements IJacket {

    public ColumbiaJacket() {
    }

    @Override
    public void PutOn(){
        System.out.println("Надета куртка Columbia");
    }

    @Override
    public void TakeOff(){
        System.out.println("Снята куртка Columbia");
    }
}
