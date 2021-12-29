package lkovsher.Lab10.TaskPresentation;

import java.util.*;

public class Run {

    public static void main(String[] args) {

        int start = 3, end = 20, element = 5;
        Smartabl smart = new Smartabl();
        Random random = new Random();

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 30; i++){
            list.add(random.nextInt(11));
        }
        System.out.println(list);
        smart.removeInRang(list,element,start, end);

        Map<String,String> map = new HashMap<String,String>();
        map.put("one","liz");
        map.put("two","olga");
        map.put("three","kate");
        map.put("dgv","liz");
        System.out.println(smart.isUniqu(map));

        Map<String,Integer> map1 = new HashMap<String,Integer>();
        map1.put("Andrey",1);
        map1.put("liza",2);
        map1.put("Sergey",3);

        Map<String,Integer> map2 = new HashMap<String,Integer>();
        map2.put("Andrey",1);
        map2.put("Sonya",2);
        map2.put("Sergey",3);
        System.out.println(smart.intersec(map1,map2));

        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            list1.add(random.nextInt(11));
        }
        System.out.println(list1);
        for(int i = 0; i < 10; i++){
            list2.add(random.nextInt(11));
        }
        System.out.println(list2);
        System.out.println(smart.countComm(list1,list2));

        Set<String> set = new HashSet<String>();
        set.add("fghjk");
        set.add("fghkhbk");
        set.add("fghjkhgv");
        set.add("fghjkb");
        System.out.println(smart.removeEvenLen(set));

        List<Integer> list3 = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            list3.add(random.nextInt(11));
        }
        System.out.println(list3);
        System.out.println(smart.maxOccurren(list3));
    }
}
