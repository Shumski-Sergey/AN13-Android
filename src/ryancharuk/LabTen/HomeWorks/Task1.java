package ryancharuk.LabTen.HomeWorks;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
	public static void main(String[] args) {
		List<Integer> grade = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			grade.add((int) (0 + Math.random() * 10));
		}
		grade.removeIf(x->(x < 5));
		System.out.println(grade);
	}

}

