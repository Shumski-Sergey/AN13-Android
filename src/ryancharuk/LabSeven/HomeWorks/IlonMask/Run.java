package ryancharuk.LabSeven.HomeWorks.IlonMask;

import ryancharuk.LabSeven.HomeWorks.IlonMask.Human.Human;
import ryancharuk.LabSeven.HomeWorks.IlonMask.Jacket.HumanJacket;
import ryancharuk.LabSeven.HomeWorks.IlonMask.Pants.HumanPants;
import ryancharuk.LabSeven.HomeWorks.IlonMask.Shoes.HumanShoes;

public class Run {
	public static void main(String[] args) {
		Human mask = new Human(new HumanJacket(true),new HumanPants(true),new HumanShoes(true),"Илон Маск");
		mask.getDressed();


	}
}
