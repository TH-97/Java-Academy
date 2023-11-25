package day02;

import java.util.Scanner;

public class WhileEx03 {
	public static void main(String[] args) {
		
		//첫번째 줄에 정수가 입력이 들어옵니다.
		//입력받은 정수받은 정수만큼 다시한번 입력받음.
		//그리고 합을 구한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력>");
		int a = sc.nextInt(); //입력받은
		
		int sum = 0; //결과 값
		int i = 1; //증가하는 값
		while (i <= a) {
			
			System.out.print(">");
			int x = sc.nextInt();
			sum = sum + x;
			i++;	
		}System.out.println("입력받은 수의 합:" + sum);
		sc.close();
		
	}

}
