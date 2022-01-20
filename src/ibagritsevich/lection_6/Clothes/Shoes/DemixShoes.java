package ibagritsevich.lection_6.Clothes.Shoes;

public class DemixShoes implements IShoes {

    public DemixShoes() {
    }

    @Override
    public void PutOn(){
        System.out.println("Надета обувь Demix");
    }

    @Override
    public void TakeOff(){
        System.out.println("Снята обувь Demix");
    }
}