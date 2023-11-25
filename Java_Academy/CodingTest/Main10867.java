package test;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main10867 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//TreeSet 생성
		TreeSet<Integer> set = new TreeSet<>();
		int N = sc.nextInt();
		// 받는거 반복
		for(int i = 0; i < N; i++) {
			set.add(sc.nextInt());
		}
		//Iterator를 이용해서 더 쉽게 뽑기
		Iterator<Integer> iter = set.iterator();
		//while(hasNext 뜻: 다음에 문자가 있다면)
		while(iter.hasNext()) System.out.print(iter.next() + " ");
	}
}

