package asemiakin.lab6.task1;

class Clothes implements  Discountable, Movable, Sellable{
    String name;
    int price;

    Clothes(String name, int price) {
        this.name = name;
        this.price = price;
    }

    private String getName() {
        return name;
    }

    private int getPrice() {
        return price;
    }

    @Override
    public void sell(){
        System.out.println("Предмет одежды «" + getName() + "» успешно продан за " + getPrice()  + " USD.");
    }

    @Override
    public void buy(){
        System.out.println("Предмет одежды «" + getName() + "» успешно приобретён за " + getPrice()  + " USD.");
    }

    @Override
    public void wear(){
        System.out.println("Вы носите предмет одежды «" + getName() + "».");
    }

}
