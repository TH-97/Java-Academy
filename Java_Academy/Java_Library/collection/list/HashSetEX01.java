package api.collection.list;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEX01 {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		//값의 추가 add
		set.add("Java");
		set.add("Java"); //중복x
		set.add("Js");
		set.add("python");
		set.add("spring");
		
		System.out.println(set.size());
		System.out.println(set.toString());
		//값이 포함 되어 있는지확인 contains
		
		//값을 얻을 때는 반복자(iteratoa) 개념을 사용햐서 반복해야ㅏㅎㅂ
//		Iterator<String> iter = new Hash
	}

}
