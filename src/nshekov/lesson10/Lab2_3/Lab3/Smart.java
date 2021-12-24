package nshekov.lesson10.Lab2_3.Lab3;

import java.util.*;

public class Smart implements Smartable{

    @Override
    public List<Integer> removeInRange(List<Integer> list, int element, int start, int end) {
        List<Integer> li = new ArrayList<>(list.subList(start, end));
        System.out.println(list);
        System.out.println(li);
        list.subList(start,end).clear();
        li.removeIf(item -> item == element);
        System.out.println(li);
        list.addAll(start, li);
        System.out.println(list);
        return list;
    }

    @Override
    public boolean isUnique(Map<String, String> map) {
        int cout = 0;
        if (map.isEmpty()) {
            return true;
        }
        else {
            for (Map.Entry<String, String> item : map.entrySet()) {
                cout = 0;
                for (Map.Entry<String, String> it : map.entrySet()) {
                    if (item.getValue() == it.getValue()){
                        cout++;
                        if (cout > 1)
                        break;
                    }
                } if (cout > 1) break;
            } if (cout > 1) return false;
            else return  true;
        }
    }

    @Override
    public Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> map3= new HashMap<>();
        for (Map.Entry<String, Integer> item : map1.entrySet()){
            for (Map.Entry<String, Integer> it : map2.entrySet()){
                if (item.equals(it)){
                    map3.put(it.getKey(), it.getValue());
                }
            }
        }
        return map3;
    }

    @Override
    public int countCommon(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);
        List<Integer> list3 = new ArrayList<>(set1);
        List<Integer> list4 = new ArrayList<>(set2);
        int cout = 0;
        for (int i = 0; i < list3.size(); i++) {
            for (int j = 0; j < list4.size(); j++) {
                if (list3.get(i) == list4.get(j)){
                    cout++;
                    break;
                }
            }
        }
        return cout;
    }

    @Override
    public Set<String> removeEvenLength(Set<String> set) {
        set.removeIf(s -> s.length()%2 == 0);
        return set;
    }

    @Override
    public int maxOccurrences(List<Integer> list) {
        int cout = 0;
        int coutMax = 0;
        for (Object in : list.toArray()){
            for (int i = 0; i < list.size(); i++) {
                if (in == list.get(i)){
                    cout++;
                }
                if (cout > coutMax){
                    coutMax = cout;
                }
            }
            cout = 0;
        }
        return coutMax;
    }
}
