package api.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx01 {
	public static void main(String[] args) {
		
		//Arraylist	와 사용방법 동일함
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("홍길동");
		list.add("이순신");
		list.add("홍길자");
		
		System.out.println(list.toString());
		//링크드리스트만의 기능 , 앞의 추가, 끝의 추가
		
		list.addFirst("A");
		list.addLast("B");
		
		System.out.println(list.toString());
		
		//값 얻기 get(인덱스)
		String x =list.get(0);
		System.out.println(x);
		//값 삭제 remove(인덱스)
		list.remove(0);
		list.remove("홍길동");
		System.out.println(list.toString());
		//값의 수정
		list.set(1,"홍길순");
		System.out.println(list.toString());
		//que기능도 사용됨
		//뒤에 추가
		list.offer("1");
		list.offer("2");
		//앞에 삭제
		System.out.println(list.poll());
		//값만 확인하기 peek
		System.out.println(list.peek());
		
		System.out.println(list.toString());
	}

}
