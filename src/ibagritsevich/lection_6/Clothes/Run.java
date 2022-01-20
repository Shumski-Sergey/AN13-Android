package ibagritsevich.lection_6.Clothes;

import ibagritsevich.lection_6.Clothes.Jacket.AdidasJacket;
import ibagritsevich.lection_6.Clothes.Jacket.ColumbiaJacket;
import ibagritsevich.lection_6.Clothes.Jacket.NikeJacket;
import ibagritsevich.lection_6.Clothes.Pants.FilaPants;
import ibagritsevich.lection_6.Clothes.Pants.NordwayPants;
import ibagritsevich.lection_6.Clothes.Pants.WesterPants;
import ibagritsevich.lection_6.Clothes.Shoes.DemixShoes;
import ibagritsevich.lection_6.Clothes.Shoes.PumaShoes;
import ibagritsevich.lection_6.Clothes.Shoes.ReebokShoes;

public class Run {
    public static void main(String[] args) {
        Human human1 = new Human("Владислав", new AdidasJacket(), new NordwayPants(), new PumaShoes());
        Human human2 = new Human("Денис", new NikeJacket(), new WesterPants(), new ReebokShoes());
        Human human3 = new Human("Артём", new ColumbiaJacket(), new FilaPants(), new DemixShoes());
        human1.GetDressed();
        human2.GetDressed();
        human3.GetDressed();
        human1.Undress();
        human2.Undress();
        human3.Undress();
    }
}
