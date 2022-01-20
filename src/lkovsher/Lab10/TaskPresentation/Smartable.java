package lkovsher.Lab10.TaskPresentation;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface Smartable {

        List<Integer> removeInRang(List<Integer> list, int element, int start, int end);

        boolean isUniqu(Map<String, String> map);

        Map<String, Integer> intersec(Map<String, Integer> map1, Map<String, Integer> map2);

        int countComm(List<Integer> list1, List<Integer> list2);

        Set<String> removeEvenLen(Set<String> set);

        int maxOccurren(List<Integer> list);

}
