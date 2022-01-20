package npopov.Lab7.Clothes;

import npopov.Lab7.Clothes.Jacket.ColumbiaJacket;
import npopov.Lab7.Clothes.Jacket.NikeJacket;
import npopov.Lab7.Clothes.Pants.AdidasPants;
import npopov.Lab7.Clothes.Pants.QuiksilverPants;
import npopov.Lab7.Clothes.Shoes.NewBalanceShoes;
import npopov.Lab7.Clothes.Shoes.PumaShoes;

public class Run {
    public static void main(String[] args) {
        Human gleb = new Human("Глеб", new ColumbiaJacket(), new AdidasPants(), new NewBalanceShoes());
        Human pavel = new Human("Павел", new NikeJacket(), new QuiksilverPants(), new PumaShoes());
        gleb.dressedAll();
        gleb.outPutPrice();
        pavel.undressAll();
        pavel.outPutPrice();
    }
}
