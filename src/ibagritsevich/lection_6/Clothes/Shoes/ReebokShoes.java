package ibagritsevich.lection_6.Clothes.Shoes;

public class ReebokShoes implements IShoes {

    public ReebokShoes() {
    }

    @Override
    public void PutOn(){
        System.out.println("Надета обувь Reebok");
    }

    @Override
    public void TakeOff(){
        System.out.println("Снята обувь Reebok");
    }
}