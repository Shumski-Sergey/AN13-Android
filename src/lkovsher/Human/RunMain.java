package lkovsher.Human;

import lkovsher.Human.Jacket.NikeJacket;
import lkovsher.Human.Jacket.PumaJacket;
import lkovsher.Human.Jacket.ReebokJacket;
import lkovsher.Human.Pants.NikePants;
import lkovsher.Human.Pants.PumaPants;
import lkovsher.Human.Pants.ReebokPants;
import lkovsher.Human.Shoes.NikeShoes;
import lkovsher.Human.Shoes.PumaShoes;
import lkovsher.Human.Shoes.ReebokShoes;
import sshumski.Lab5.Person;

public class RunMain {
    public static void main(String[] args) {
        NikeShoes nikeShoes = new NikeShoes(3000);
        NikeJacket nikeJacket = new NikeJacket(2000);
        NikePants nikePants = new NikePants(1200);

        PumaJacket pumaJacket = new PumaJacket(4000);
        PumaPants pumaPants = new PumaPants(4560);
        PumaShoes pumaShoes = new PumaShoes(5000);

        ReebokJacket reebokJacket = new ReebokJacket(5400);
        ReebokShoes reebokShoes = new ReebokShoes(3400);
        ReebokPants reebokPants = new ReebokPants(3200);

        Human humanOne = new Human( "Liza",reebokJacket, pumaPants,nikeShoes );
        humanOne.putOnClothing();
        humanOne.priceOfClothing();
        Human humanSecond = new Human( "Andrey",nikeJacket,reebokPants,pumaShoes);
        humanSecond.putOnClothing();
        humanSecond.priceOfClothing();
        Human humanThird = new Human("Katya", pumaJacket, nikePants,reebokShoes);
        humanThird.putOnClothing();
        humanThird.priceOfClothing();

        humanOne.removeClothing();
        humanSecond.removeClothing();
        humanThird.removeClothing();

    }
}
