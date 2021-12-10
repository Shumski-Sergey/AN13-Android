package aalekseenko.Lection6.Task1_Interface;

public class Clothes implements Movable, Sellable, Discountable{
    String nameOfClothes;
    int amount;

    public Clothes(String nameOfClothes, int amount){
    this.nameOfClothes = nameOfClothes;
    this.amount = amount;
    }

public String getNameOfClothes() {return nameOfClothes;};

public int getAmount() {return amount;};

    @Override
    public void discount() {
if (amount>3) System.out.println("Вам положена скидка 10% на товар " + nameOfClothes);
else System.out.println("Товар " + nameOfClothes + " без скидки");
    }


    @Override
    public void dressed() {
        System.out.println("Теперь вы одеты! Ура!");

    }

    @Override
    public void soldOut() {
        System.out.println("Вы купили " + amount + " вещей");

    }
}
