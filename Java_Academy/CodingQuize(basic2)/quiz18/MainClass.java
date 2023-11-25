package quiz18;

import java.util.Scanner;

public class MainClass {
	
	/*
	 * 1. 스캐너를 통해서 정수 2개를 입력 받습니다
	 * 2. 입력받은 값이 정수라면, 두 정수의 합을 출력하고 반복문을 종료
	 * 3. 입력받은 값이 에러를 발생시키면, " 정수로만 입력하세요" 를 출력하고 다시 입력받습니다.
	 * 4. 반복을 탈출하면 " 프로그램 정상종료" 문장을 띄워주면 됩니다.
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		
		int total = 0;
		while(true) {
			try {
				System.out.print("정수1>");
				int num1 = sc.nextInt();
				System.out.print("정수2>");
				int num2 = sc.nextInt();
				total = num1 + num2;
				if(total % 1 == 0) {
					System.out.println("합:" + total);
					sc.close();
					break;
				}
				}catch(Exception e) {
					System.out.println("정수를 적으세요");
					sc.nextLine();
				}
		}
		
		
	}

}
