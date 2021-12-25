package ryancharuk.LabTen.LabThree;

import java.util.*;

public class labThree implements Smartable {

	public List<Integer> removeInRange(List<Integer> list, int element, int start, int end) {
		list.subList(start, end).removeIf(x->(x == element));
		return list;
	}


	public boolean isUnique(Map<String, String> map) {
		boolean check = true;
		for (String value : map.values()) {
			if (Collections.frequency(map.values(), value) > 1) {
				check = false;
				break;
			}
		}
		return check;
	}


	public Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {

		Map<String, Integer> map3 = new HashMap<>();
		for (Map.Entry<String, Integer> v : map1.entrySet()) {
			for (Map.Entry<String, Integer> v2 : map2.entrySet()) {
				if (v.equals(v2)) {
					map3.put(v.getKey(), v.getValue());
				}
			}
		}
		return map3;
	}

	@Override
	public int countCommon(List<Integer> list1, List<Integer> list2) {
		Set<Integer> set2 = new HashSet<>(list2);
		int count = 0;
		for (Integer integer : list1) {
			for (int j = 0; j < set2.size(); j++) {
				if (integer.equals(list2.get(j))) {
					count++;
					break;
				}
			}
		}
		return count;
	}

	@Override
	public Set<String> removeEvenLength(Set<String> set) {
		set.removeIf(x->(x.length() % 2 == 0));
		return set;
	}

	@Override
	public int maxOccurrences(List<Integer> list) {
		int count = 0;
		int countMax = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 1; j < list.size() - 1; j++) {
				if (list.get(i).equals(list.get(j))) {
					count++;
				}
			}
			if (countMax < count) {
				countMax = count;
				count = 0;
			}
		}
		return countMax;
	}
}
