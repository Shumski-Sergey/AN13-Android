package ryancharuk.LabTen.HomeWorks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
	public static void main(String[] args) {
		List<Integer> random = new ArrayList<>();
		for (int i = 0; i < 15; i++) {
			random.add((int) (0 + Math.random() * 15));
		}
		System.out.println(random);

		random = random.stream().distinct().collect(Collectors.toList());
		System.out.println(random);
	}
	}
