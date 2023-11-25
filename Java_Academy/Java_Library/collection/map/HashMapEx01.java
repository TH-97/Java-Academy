package api.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapEx01 {
	public static void main(String[] args) {
		//<키에대한타입, 값에대한타입>
		//HashMap<Integer, String> map = new HashMap<>();
		
		Map<Integer, String> map = new HashMap<>();
		
		//값을 추가 put
		//키값은 동일
		map.put(1,"짱구");
		map.put(3,"훈이");
		map.put(2,"유리");
		map.put(4,"철수");
		map.put(5,"짱구");
		map.put(6,"맹구");
		
		System.out.println(map.size());
		System.out.println(map.toString());
		
		//값의 수정 - 맵에 동일한 키를 이용해서 변경하면 됩니다.
		
		map.put(5, "홍길동");
		System.out.println(map.toString());
		
		//값을 얻기 - get
		
		System.out.println(map.get(3));
		
		//값을 삭제 remove
		
		map.remove(5);
		System.out.println(map.toString());
		
		//키 or 값의 포함 여부
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("짱구"));
		
		//맵을 반복하는 방법
		Set<Integer> set = map.keySet();
		for(Integer i : set) {
			System.out.println("키:" + i + ", 값:" + map.get(i));
		}
		Set<Entry<Integer, String>> entry = map.entrySet();
		for(Entry<Integer, String> e : entry) {
			System.out.println(e.getKey() + e.getValue());
		}
		
		System.out.println("=============");
		
		//TreeMap은 사용방법이 동일 합니다.
		//키가 저장되는 구조가 이진탐색트리를 이용해서 키를 저장합니다.
		//키가 오름차순정렬이 됩니다.
		TreeMap<String, Object> map123 = new TreeMap<>();
	}

}
