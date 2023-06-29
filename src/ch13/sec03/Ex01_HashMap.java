package ch13.sec03;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex01_HashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("사과", 1000); map.put("배", 2000); map.put("감", 800);
		System.out.println(map.size());

//		key로 값 얻기 이 방법 권장
		int val=map.get("배");
		System.out.println("배 값은 "+val);
		
		Set<String> keySet = map.keySet();
		for(String key: keySet) System.out.println(key+" : "+map.get(key));
		
//		Tree -> 순서 보장
		Map<String, Integer> map2 = new TreeMap<>();
		
		map2.put("사과", 1000); map2.put("배", 2000); map2.put("감", 800);
		System.out.println(map2.size());

//		key로 값 얻기
		int val2=map2.get("배");
		System.out.println("배 값은 "+val2);
		
		Set<String> keySet2 = map2.keySet();
		for(String key: keySet2) System.out.println(key+" : "+map2.get(key));
		
//		Entry의 Set collection
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer>entry:entrySet)
			System.out.println(entry.getKey()+ " : "+entry.getValue());

//		Stream으로 처리
		map.forEach((k,v)->System.out.println(k+" : "+v));
		
//		검색
		System.out.println(map.containsKey("Apple"));
		System.out.println(map.containsValue(2000));
		
		map.put("사과", 1500);
		map.forEach((k,v)->System.out.println(k+" : "+v));
//		Entry 삭제
		map.remove("감");
		map.forEach((k,v)->System.out.println(k+" : "+v));
		
		
		
		
		
		
		
	}

}
