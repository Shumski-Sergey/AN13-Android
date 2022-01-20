package ryancharuk.LabTen.HomeWorks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task3 {
	public static void main(String[] args) {
		List<Integer> grade  = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			grade.add((int) (0 + Math.random()*10));
		}
		System.out.println(grade);
		Iterator<Integer> it = grade.iterator();
		int max = grade.get(0);
		while(it.hasNext()) {
			Integer nextGrade = it.next();
			if (max < nextGrade) {
				max = nextGrade;
			}
		}
		System.out.println(max);
	}
}
