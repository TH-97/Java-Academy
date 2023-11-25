package api.collection.list;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx01 {
	public static void main(String[] args) {
		//TreeSet == 정렬 된 셋 )오름차순
		
		//사용방법은 Hashset과 동일 함
		Set<String> set = new TreeSet<>();
		
		set.add("홍길동");
		set.add("홍길자");
		set.add("짱구");
		set.add("철수");
		set.add("훈이");
		set.add("유리");
		//: 출력 유리 짱구 철수 홍길동 홍길자 훈이
	}

}
