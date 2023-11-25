package api.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx01 {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
//		List<String> list = new ArrayList<String>();
		
		//list 값추가
		list.add("Java");
		list.add("Spring");
		list.add("Database");
		list.add("Js");
		list.add("Docker");
		
		System.out.println(list.toString());
		
		//크기 확인
		System.out.println(list.size());
		
		//값을 중간에 추가
		list.add(2,"이순신");
		System.out.println(list.toString());
		
		//값을 한번에 추가
		
		String[] arr = {"A", "B", "C"};
		List<String> newlist = Arrays.asList(arr);
		
		list.addAll(newlist);
		System.out.println(list.toString());
		
		//값 확인 get
		//list[0] == list.get(0);
		String x = list.get(0);
		System.out.println(x);
		System.out.println(list.toString());
		
		//값의 삭제 remove(인덱스),remove(값)
		list.remove(2);
		System.out.println(list.toString());
		
		list.remove("A");
		System.out.println(list.toString());
		
		//값의 수정
		list.set(3, "홍길동");
		
		
		//포함여부 확인
		if(list.contains("Java")) {
			System.out.println("존재함");
		}
		
		//전체삭제 clear(공용)
		
	}

}
