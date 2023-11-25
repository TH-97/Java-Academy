package quiz01;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		//구구단 수를 입력받아서, 구구단 출력
		//정수를 입력하세요> 5
		//구구단:5단
		//5 x 1 = 5
		//....
		//5 x 9 = 45
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요.");
		int i = sc.nextInt();
		System.out.println("구구단" + i + "단");
	
		int a = 1;
		
		while(a < 10) {
			System.out.println(i + "x" + a  + "=" + i * a);
			a++;
		}sc.close();
	}

}
