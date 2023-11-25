package quiz01;

import java.util.Scanner;

public class Quzi05 {
	public static void main(String[] args) {
		// 입력을 1개 받아서 짝수, 홀수, 0, 음수 조건 나누기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		System.out.print(">");
		int a = sc.nextInt();
		
		if (a==0) {
			System.out.println(a+"은 0 입니다.");
			
		}else if(a<0){
			System.out.println(a+"은 음수 입니다.");
			
		}else if(a % 2 == 0) {
			System.out.println(a+"은 짝수 입니다.");
			
		}else {//홀수 구하는 법 아마도 (a % 2 != 0)
			System.out.println(a+"은 홀수 입니다.");
			
		}
		
		sc.close();
		
	}

}
