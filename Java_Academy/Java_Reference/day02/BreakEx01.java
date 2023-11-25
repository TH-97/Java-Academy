package day02;

import java.util.Scanner;

public class BreakEx01 {
	public static void main(String[] args) {
		
		for(int i = 1 ; i <= 10;i++) {
			System.out.println(i);
			if(i == 5) {
				break;
			}
		}
		/*
		 * 무한반복문
		 * 반복횟수를 정확히 모루고 있을 때, break으로 빠져나오는 형태로 사용됩니다.
		 * 자바에서 무한반복은 while(true)를 사용합니다.
		 */
		int i = 1;
		while(true) {
			System.out.println(i);
			if(i==10) break;
			i++;
		}
		
		System.out.println("---");
		
		/*
		 * 사용자가 입력한 값이 0 일 때 까지, 입력을 계속 받기
		 */
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.print(">");
			int a = sc.nextInt();
			
			if(a == 0) break;
		}sc.close();
	}

}
