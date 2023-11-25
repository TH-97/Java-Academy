package day02;

import java.util.Scanner;

public class BreakEx02 {
	public static void main(String[] args) {
		// 정답맞추기
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true) {
			System.out.println("피카츄가 양파를 까면서 하는 말은?");
			System.out.print("정답을 입력하세요");
			String answer = sc.next();
			count++; //정답을 입력한 후에 카운트 체
			if(answer.equals("언제언제까지")) {
				System.out.println("정답입니다");
			}else {
				System.out.println("틀렸습니다");
			}sc.close();
			System.out.println(count);
		}
			
	}

}
