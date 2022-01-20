package vabramchuk.Lab7.Lab_clothes;

import vabramchuk.Lab7.Lab_clothes.jacket.ColambiaJacket;
import vabramchuk.Lab7.Lab_clothes.jacket.GuchiJacket;
import vabramchuk.Lab7.Lab_clothes.jacket.SvitanakJacket;
import vabramchuk.Lab7.Lab_clothes.pants.ColambiaPants;
import vabramchuk.Lab7.Lab_clothes.pants.GushiPants;
import vabramchuk.Lab7.Lab_clothes.pants.SvitanakPants;
import vabramchuk.Lab7.Lab_clothes.shoes.KelmeShoes;
import vabramchuk.Lab7.Lab_clothes.shoes.MarkoShoes;
import vabramchuk.Lab7.Lab_clothes.shoes.MegatopShoes;

public class Run {
    public static void main(String[] args) {
        clothes viktor = new clothes(new ColambiaJacket(), new GushiPants(), new MegatopShoes(), "Viktor");
        clothes Alehandro = new clothes(new SvitanakJacket(), new SvitanakPants(), new KelmeShoes(),"Alehandro");
        clothes Tom = new clothes(new GuchiJacket(), new ColambiaPants(), new MarkoShoes(), "Tom");

        viktor.don();
        viktor.takeoff();
        Alehandro.don();
        Alehandro.takeoff();
        Tom.don();
        Tom.takeoff();
    }
}
