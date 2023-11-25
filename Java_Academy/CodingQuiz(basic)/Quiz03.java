package quiz01;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		//키와 나이를 입력하세요(키는 실수, 나이는 정수)
		//키는 140 이상 나이는 8세 이상!
		//키> 141
		//나이> 8 
		//놀이기구 탑승이 가능합니
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 나이를 입력하세요(키는 실수, 나이는 정수)");
		System.out.println("키는 140이상 나이는 8세 이상!");
		
		System.out.print("키>");
		double cm = sc.nextDouble() ;
		System.out.print("나이>");
		int age = sc.nextInt() ;
		
		if (cm >= 140 && age >= 8) {
			System.out.println("놀이기구 탑승이 가능합니다.");
		}else {
			System.out.println("놀이기구 탑승이 불가합니다.");
			
		}sc.close();
		
	}

}
