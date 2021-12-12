package epavlyutin.pack7.clothes;

import epavlyutin.pack7.clothes.jacket.BershkaJacket;
import epavlyutin.pack7.clothes.jacket.ZaraJacket;
import epavlyutin.pack7.clothes.pants.BershkaPants;
import epavlyutin.pack7.clothes.pants.ZaraPants;
import epavlyutin.pack7.clothes.shoes.BershkaShoes;
import epavlyutin.pack7.clothes.shoes.ZaraShoes;

public class Run {
    public static void main(String[] args) {
        Man Rahnar = new Man(new BershkaJacket(),new ZaraPants(),new BershkaShoes(),"Rahnar");
        Man Ivar = new Man(new ZaraJacket(),new BershkaPants(), new ZaraShoes(),"Ivar");
        Rahnar.putOn();
        Rahnar.takeOff();
        Ivar.putOn();
        Ivar.takeOff();

    }
}
