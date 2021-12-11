package nshekov.lesson7.Task2Clothes;

import nshekov.lesson7.Task2Clothes.Jacket.ColambiaJacket;
import nshekov.lesson7.Task2Clothes.Jacket.WrugelJacket;
import nshekov.lesson7.Task2Clothes.Pants.DropPants;
import nshekov.lesson7.Task2Clothes.Pants.StagoPants;
import nshekov.lesson7.Task2Clothes.Shoes.BelwestShoes;
import nshekov.lesson7.Task2Clothes.Shoes.MarkoShoes;

public class TestDrive {
    public static void main(String[] args) {
        Man nikita = new Man("Никита", new ColambiaJacket(), new DropPants(), new BelwestShoes());
        nikita.putOn();
        nikita.takeOff();
        Man tom = new Man("Томас", new WrugelJacket(), new StagoPants(), new MarkoShoes());
        tom.putOn();
        tom.takeOff();
    }
}
