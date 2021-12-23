package vabramchuk.Lab10;

import java.util.HashMap;
import java.util.Map;

public class Lab1_1 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String text = "Маша любит кашу";
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> check : map.entrySet()) {
            System.out.println("Буква:  " + check.getKey() + ", встречается: " + check.getValue() + " раз(a).");
        }
    }
}
