package npopov.Lab5.AnimalsLab5;

public class Dragon extends BigAnimal {

    public Dragon(String size) {
        super(size);
    }

    @Override
    public String getSize() {
        String str;
        str = "Размер животного: ".concat(super.getSize());
        return str;
    }
}
