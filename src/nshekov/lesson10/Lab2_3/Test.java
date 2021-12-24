package nshekov.lesson10.Lab2_3;

import nshekov.lesson10.Lab2_3.Lab2.ProductInBasket;
import nshekov.lesson10.Lab2_3.Lab3.Smart;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        /*ProductInBasket pib = new ProductInBasket();
        pib.addProduct("Shoes", 4);
        pib.addProduct("Кофта", 3);
        pib.getProducts();
        pib.getProductQuantity("Shoes");
        pib.updateProductQuantity("Шапка", 12);
        pib.getProducts();
        pib.getProductQuantity("Шапка");*/
        Smart smart = new Smart();
        List<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0,5,0,6,0));
        smart.removeInRange(list,0, 4,10);
        Map<String,String> map = new HashMap<>(){{
            put("Vasa", "vova1");
            put("Vasa1", "vova2");
            put("Vasa2", "vova3");
            put("Vasa3", "vova4");
        }};
        Smart has = new Smart();
        boolean b = has.isUnique(map);
        System.out.println(b);
        Map<String,String> map1 = new HashMap<>();
        System.out.println(has.isUnique(map1));
        Smart inter = new Smart();
        Map<String, Integer> mapA = new HashMap<>(){{
            put("Janet", 87);
            put("Logan", 62);
            put("Whitaker", 46);
            put("Alyssa",100);
            put("Stefanie",80);
            put("Jeff",88);
            put("Kim",52);
            put("Sylvia",95);
        }};
        Map<String, Integer> mapB = new HashMap<>(){{
            put("Logan", 62);
            put("Kim", 52);
            put("Whitaker", 52);
            put("Jeff", 88);
            put("Stefanie",80);
            put("Brian",60);
            put("Lisa",83);
            put("Sylvia", 87);
        }};
        System.out.println(inter.intersect(mapA, mapB));

        Smart smart4 = new Smart();
        List<Integer> list1 = new ArrayList<>(Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(-5, 15, 2, -1, 7, 15, 36));
        System.out.println(smart4.countCommon(list1, list2));

        Smart smart5 = new Smart();
        Set<String> set = new HashSet<>(Arrays.asList("foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"));
        System.out.println(smart5.removeEvenLength(set));

        Smart smart6 = new Smart();
        List<Integer> list6 = new ArrayList<>(Arrays.asList(4, 7, 4, -1, 2, 4, 7, 2, 15, 15));
        System.out.println(smart6.maxOccurrences(list6));
    }
}
