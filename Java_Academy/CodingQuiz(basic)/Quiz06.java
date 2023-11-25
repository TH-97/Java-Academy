package quiz01;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		//정수1>
		//연산을 선택하세여 [+-*/]> +
		//정수2>
		// 두 수의 덧셈은: 10
		// 잘못된 연산을 선택 하셧습니
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1>");
		int n1 = sc.nextInt();
		System.out.print("연산을 선택하세요 [+,-,*,/]>");
		String sper = sc.next();
		System.out.print("정수2>");
		int n2 = sc.nextInt();
		
		
		switch (sper) {
		case "+":
			System.out.println(n1 + n2);
		case "-":
			System.out.println(n1 - n2);
		case "*":
			System.out.println(n1 * n2);
		case "/":
			System.out.println(n1 / n2);
			
		default:
			System.out.println("다시 넣으시오.");

		}sc.close();
	}

}
