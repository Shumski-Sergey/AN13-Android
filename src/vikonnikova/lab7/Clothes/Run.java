package vikonnikova.lab7.Clothes;

import vikonnikova.lab7.Clothes.Coat.ColumbiaCoat;
import vikonnikova.lab7.Clothes.Coat.FinnFlareCoat;
import vikonnikova.lab7.Clothes.Coat.OutventureCoat;
import vikonnikova.lab7.Clothes.Pants.ColinsPants;
import vikonnikova.lab7.Clothes.Pants.LevisPants;
import vikonnikova.lab7.Clothes.Pants.MangoPants;
import vikonnikova.lab7.Clothes.Shoes.GucciShoes;
import vikonnikova.lab7.Clothes.Shoes.NikeShoes;
import vikonnikova.lab7.Clothes.Shoes.TimberlandShoes;

public class Run {
    public static void main(String[] args) {
        Person Alisa = new Person("Алиса", new ColumbiaCoat(), new ColinsPants(), new NikeShoes());
        String AlisaName = Alisa.getName();
        Person Alexa = new Person("Алекса", new FinnFlareCoat(), new LevisPants(), new GucciShoes());
        String AlexaName = Alexa.getName();
        Person Marusya = new Person("Маруся", new OutventureCoat(), new MangoPants(), new TimberlandShoes());
        String MarusyaName = Marusya.getName();
        System.out.println(AlisaName);
        Alisa.putOn();
        Alisa.takeOff();
        System.out.println(AlexaName);
        Alexa.putOn();
        Alexa.takeOff();
        System.out.println(MarusyaName);
        Marusya.putOn();
        Marusya.takeOff();
    }
}
