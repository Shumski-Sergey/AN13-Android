package ryancharuk.LabTen;

import java.util.HashMap;
import java.util.Map;

public class labOne {
	
	public static void main(String[] args) {

		Map<Character, Integer> map = new HashMap<>();
		String text = "hello world";

		for (char c: text.toCharArray()) {
			if (Character.isLetter(c)){
				if (map.containsKey(c)){
					map.put(c,map.get(c)+ 1);
				}
				else {
					map.put(c,1);
				}
			}
		}
		for (Map.Entry <Character,Integer> check: map.entrySet()) {
			System.out.println("Буква: " + check.getKey() + ", встречается: " + check.getValue() + " раз(a).");
		}
	}
}
