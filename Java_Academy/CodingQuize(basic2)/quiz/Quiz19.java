package quiz;

import java.util.Scanner;

public class Quiz19 {
	public static void main(String[] args) {
		/*
		 * up down 게임
		 * 1~100까지 임의의 랜덤한 정수가 결정되고, 정답을 맞추는 프로그
		 * 정답입력>
		 * 더 작은 수를 입력하세요
		 * 더 큰 수를 입력하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int i = (int)(Math.random()* 100)+1;
		int count = 0;
		while(true) {
			System.out.print("정답입력>");
			int answer = sc.nextInt();
			if(i == answer) {
				System.out.println("정답입니다");
				break;
			}else if(i < answer) {
				System.out.println("더 작은 수를 입력하세요");
			}else if(i > answer) {
				System.out.println("더 큰 수를 입력하세요");
			}count++;
		}System.out.println("시도횟수:"+ count);
		sc.close();
	}

}
