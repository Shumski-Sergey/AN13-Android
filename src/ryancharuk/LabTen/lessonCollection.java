package ryancharuk.LabTen;


import java.util.HashSet;

public class lessonCollection {
	public static void main(String[] args) {
		HashSet<Integer> arrayList = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			arrayList.add((int) (0 + Math.random()*10));
		}
		arrayList.forEach(n->System.out.print(n + " "));
	}
}
