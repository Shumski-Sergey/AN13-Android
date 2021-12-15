package aalekseenko.Lection7.Clothes;

import aalekseenko.Lection7.Clothes.Jacket.BaonJacket;
import aalekseenko.Lection7.Clothes.Jacket.ChinaJacket;
import aalekseenko.Lection7.Clothes.Jacket.SiveraJacket;
import aalekseenko.Lection7.Clothes.Pants.CosPants;
import aalekseenko.Lection7.Clothes.Pants.HugobossPants;
import aalekseenko.Lection7.Clothes.Pants.IncotexPants;
import aalekseenko.Lection7.Clothes.Shoes.EccoShoes;
import aalekseenko.Lection7.Clothes.Shoes.HoglShoes;
import aalekseenko.Lection7.Clothes.Shoes.TimberlandShoes;


public class Runner {
    public static void main(String[] args) {
        BaonJacket baonJacket = new BaonJacket(45);
        ChinaJacket chinaJacket = new ChinaJacket(15);
        SiveraJacket siveraJacket = new SiveraJacket(70);
        CosPants cosPants = new CosPants(55);
        HugobossPants hugobossPants = new HugobossPants(35);
        IncotexPants incotexPants = new IncotexPants(50);
        EccoShoes eccoShoes = new EccoShoes(60);
        HoglShoes hoglShoes = new HoglShoes(55);
        TimberlandShoes timberlandShoes = new TimberlandShoes(75);

        Human human = new Human("Vasya", chinaJacket, hugobossPants, eccoShoes);
        human.getDress();
        human.unDress();
    }
}
