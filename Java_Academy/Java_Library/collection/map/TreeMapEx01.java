package api.collection.map;

import java.util.*;
import java.util.Map.Entry;

public class TreeMapEx01 {
	public static void main(String[] args) {
		//TreeMap은 사용방법이 동일 합니다.
				//키가 저장되는 구조가 이진탐색트리를 이용해서 키를 저장합니다.
				//키가 오름차순정렬이 됩니다.
				TreeMap<String, Object> map = new TreeMap<>();
				
				map.put("짱구", "20세");
				map.put("유리", "30세");
				map.put("훈이", "40세");
				map.put("맹구", "20세");
				
				System.out.println(map.toString());
				
				Object o = map.get("맹구");
				System.out.println((String)o);
				
				//검색에 특화된 기능을 제공해줍니다
				Entry<String, Object> entry = map.higherEntry("훈아");
				
				//트리주고에서 한단계 더 높은 위치에 있는 키중에서 가장 작은 값
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
	}

}
