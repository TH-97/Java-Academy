package day01;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		
		//1.스캐너 생
		Scanner sc = new Scanner(System.in);
		
		//2. 스캐너가 가지고 있는 이능을 이용하여 데이터를 받음
		System.out.print("이름을 입력>");
		String name = sc.next(); //문자열 입력받아서 변수에 저장 
		
		System.out.println("나이를 입력>");
		int age = sc.nextInt();
		
		System.out.println("키를 입력>");
		double cm = sc.nextDouble(); // 끝에 엔터 값이 남음 (실수형이때?)
		
		System.out.println("자기소개하>");
		sc.nextLine(); // 엔터값을 소모시킨다.
		String intro = sc.nextLine();
		
		System.out.println("이름:"+ name + ",나이:"+ age + ",신장:");
		
		//스캐너 자원해제
		sc.close();
		
		
				
				
		
	}

}
