package quiz;

import java.util.Scanner;

public class MethodQuiz02 {
	public static void main(String[] args) {
		//두 수를 입력받아서 두 수의 합을 구하세요.
		//print()
//		System.out.println("두 정수를 입력하세요!");
		//input() - 메서드 내부에서 입력을 받아서 리턴하는 메서드로 변경 - 2
//		Scanner sc = new Scanner(System.in);
		System.out.print(">");
//		int num = sc.nextInt();
//		System.out.print(">");
//		int num2 = sc.nextInt();
		// add() - 두 수의 합을 더해서 결과를 리턴
//		int result = num + num2;
		
		//result - 결과를 받아서 출력
//		System.out.println("두 수의 합:"+ result);
		
//		sc.close();
		
		print();
		int num1 = input();
		int num2 = input();
		int result = add(num1,num2);
		result(result);
		
	}
	
	static void print() {
		System.out.println("두 정수를 입력하세요");
	}
	
	static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print(">");
		return sc.nextInt();
	}
	
	static int add(int a, int b) {
		return a + b;
	}
	static void result(int result) {
		System.out.println("두 수의 합:" + result);
	}
	
}
