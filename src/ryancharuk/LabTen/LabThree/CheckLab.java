package ryancharuk.LabTen.LabThree;

import java.util.*;

public class CheckLab {
	public static void main(String[] args) {
		labThree labThree = new labThree();
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(2);

		ArrayList<Integer> arrayList1 = new ArrayList<>();
		arrayList1.add(1);
		arrayList1.add(0);
		arrayList1.add(1);
		arrayList1.add(3);
		arrayList1.add(1);


//		System.out.println(labThree.removeInRange(arrayList, 0, 3, 6));
		Map<String, String> map = new HashMap<>();
		map.put("Вася", "Иванов");
		map.put("Петя", "Петров");
		map.put("Коля", "Жопов");
		map.put("Жека", "Китов");
//		System.out.println(labThree.isUnique(map));
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("Вася2", 22);
		map2.put("Петя", 23);
		map2.put("Коля2", 24);
		map2.put("Жека", 25);
		Map<String, Integer> map3 = new HashMap<>();
		map3.put("Вася", 22);
		map3.put("Петя", 23);
		map3.put("Коля", 24);
		map3.put("Жека", 25);
//		System.out.println(labThree.intersect(map2, map3));
//		System.out.println(labThree.countCommon(arrayList,arrayList1));

		Set<String> items = new HashSet<>();
		items.add("foo");
		items.add("buzz");
		items.add("bar");
		items.add("fork");
		items.add("bort");
		items.add("spoon");
		items.add("!");
		items.add("dude");
//		System.out.println(labThree.removeEvenLength(items));
		System.out.println(labThree.maxOccurrences(arrayList));

	}
}
