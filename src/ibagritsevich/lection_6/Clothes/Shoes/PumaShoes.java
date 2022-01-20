package ibagritsevich.lection_6.Clothes.Shoes;

public class PumaShoes implements IShoes {

    public PumaShoes() {
    }

    @Override
    public void PutOn(){
        System.out.println("Надета обувь Puma");
    }

    @Override
    public void TakeOff(){
        System.out.println("Снята обувь Puma");
    }
}