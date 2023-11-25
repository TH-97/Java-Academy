package quiz;

import java.util.Scanner;

public class Quiz20 {
	public static void main(String[] args) {
		/*
		 * 랜덤한 문제내고 맞추기
		 * 
		 * 44 + 48 = ?
		 * [문제를 그만 푸시려면 0을 입력하세요.]
		 * > 100
		 * 정답입니다
		 * -----------------
		 * 16 + 91 = ?
		 * [문제를 그만 푸시려면 0을 입력하세요.]
		 * >1
		 * 틀렸습니다
		 * ------
		 * 70 + 15 = ?
		 * [문제를 그만 푸시려면 0을 입력하세요.]
		 * >0
		 * 프로그램 정상 종료
		 * 정답:1
		 * 오답:1
		 */
		Scanner sc = new Scanner(System.in);
		

		int countT = 0;
		int countF = 0;
		while(true) {
			int num = (int)(Math.random() * 100)+1;
			int num0 = (int)(Math.random() * 100)+1;
			System.out.println(num + "+" + num0 + "=" + "?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요]");
			System.out.print(">");
			int answer = sc.nextInt();
			
			if(answer == (num + num0)) {
				System.out.println("정답입니다");
				countT++;
			} else if(answer == 0) {
				break;
			} else {
				System.out.println("틀렸습니다");
				countF++;
			}
		}System.out.println("프로그램 정상 종료");
		System.out.println("정답:" + countT);
		System.out.println("오답:" + countF);
		sc.close();
	}

}
