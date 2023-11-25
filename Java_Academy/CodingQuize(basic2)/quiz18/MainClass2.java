package quiz18;

import java.util.Scanner;

public class MainClass2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = (int)(Math.random()* 100)+1;
		int count = 0;
		while(true) {
			try {
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
				System.out.println("시도횟수:"+ count);
			}catch(Exception e) {
				System.out.println("정수를 적으세요");
				sc.nextLine();
			}
		}
			
	}
	
}
