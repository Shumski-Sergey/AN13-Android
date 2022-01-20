package nshekov.lesson10.Lab1;

import java.util.HashMap;
import java.util.Map;

public class UniqueChars {

    private Map<Character, Integer> map = new HashMap<>();
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void calculate() {
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }
    }

    public void print(){
        for (Map.Entry<Character, Integer> item : map.entrySet()){
            System.out.printf("Буква: %s  Повторений: %s\n", item.getKey(), item.getValue());
        }
    }

}
