package lkovsher.Lab10.TaskPresentation;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface Smartable {

        public List<Integer> removeInRang(List<Integer> list, int element, int start, int end);

        public boolean isUniqu(Map<String, String> map);

        public Map<String, Integer> intersec(Map<String, Integer> map1, Map<String, Integer> map2);

        public int countComm(List<Integer> list1, List<Integer> list2);

        public Set<String> removeEvenLen(Set<String> set);

        public int maxOccurren(List<Integer> list);

}
