package lkovsher.Lab10.TaskPresentation;

import java.util.*;


public class Smartabl implements Smartable {


    public List<Integer> removeInRang(List<Integer> list, int element, int start, int end) {
        list.subList(start, end).removeIf(x->(x == element));
        System.out.println(list);
        return null;
    }


    public boolean isUniqu(Map<String, String> map) {
        boolean flag = false;
        Set<Object> uniqueValues = new HashSet<>(map.values());
        if(map.isEmpty()){
            flag = true;
        }
        if(map.size() == uniqueValues.size()){
            flag = true;
        }
        return flag;
    }


    public Map<String, Integer> intersec(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String,Integer> map3 = new HashMap<>();
        for (Map.Entry<String, Integer> enty1 : map1.entrySet()){
            for (Map.Entry<String, Integer> enty2 : map2.entrySet()){
                if (enty1.equals(enty2)){
                    map3.put(enty1.getKey(), enty1.getValue());
                }
            }
        }
        return map3;
    }


    public int countComm(List<Integer> list1, List<Integer> list2) {
        Set<Object> uniqueValues1 = new HashSet<>();
        for(int i = 0; i < list1.size(); i++){
            for (int j = 0; j < list2.size(); j++){
                if(list1.get(i) == list2.get(j)){
                    uniqueValues1.add(list1.get(i));
                }
            }
        }
        return uniqueValues1.size();
    }


    public Set<String> removeEvenLen(Set<String> set) {
        List<String> list1 = new LinkedList<>(set);
        for(int i = 0; i < list1.size(); i++){
            if((list1.get(i).length() % 2) == 0){
                list1.remove(i);
            }
        }
        set.clear();
        set.addAll(list1);
        return set;
    }


    public int maxOccurren(List<Integer> list) {
        int max = 0, temp;
        for(int i = 0; i < 10; i++) {
            temp = Collections.frequency(list, i);
            if(max < temp){
                max = temp;
            }
        }
        return max;
    }
}
