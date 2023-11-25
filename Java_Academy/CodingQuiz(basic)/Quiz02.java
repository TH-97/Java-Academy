package quiz01;

import java.util.*;

public class Quiz02 {
	public static void main(String[] args) {
		// 바구니 크기 입력> 10
		// 사과의 개수 입력 > 75
		// 사과개수:75
		// 바구니는 8개가 필요

		Scanner sc = new Scanner(System.in);
		
		System.out.println("바구나 크기 입력.>");
		int bk = sc.nextInt();
		
		System.out.println("사과의 개수 입력.>");
		int ap = sc.nextInt();
		
		System.out.println("사과개수>" + ap);
		
		int i = ap / bk + (ap%bk > 0 ? 1 : 0);
		//int result = ap % bk == 0 ? ap/bk : ap/bk +1);
		
		System.out.println(i);
		sc.close();

		
	}


}
