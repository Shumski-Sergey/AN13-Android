package npopov.Lab5.AnimalsLab5;

public class Goose extends SmallAnimal {

    public Goose(String size) {
        super(size);
    }

    @Override
    public String getSize() {
        String str;
        str = "Размер животного: ".concat(super.getSize());
        return str;
    }
}
