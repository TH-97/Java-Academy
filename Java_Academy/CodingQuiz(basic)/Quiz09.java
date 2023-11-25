package quiz01;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		// 어떤 수를 입력 받고, 1~ 입력 받은 수까지 합계를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 기입 하시오");
		int a = sc.nextInt();
		int b = 1;
		int sum = 0;
		while(b <= a) {
			sum = sum + b;
			b++;
		}
		System.out.println("전체 합은:" + sum );
		// 1 ~ 100까지 정수 중에서 짝수만 자로로 출력
		int cnt = 1;
		while(cnt <= 100) {
			if(cnt % 2 == 0) {
				System.out.print(cnt);
			}
			cnt++;
			
		}
		System.out.println();// 줄바꿈
		// 1000의 약수의 갯수 출력.
		int num1 = 1000;
		int i = 1;
		int cnt1 = 0;
		while(i <= num1) {
			if( num1 % i == 0) {
				cnt1++;
			}
			i++;
		} System.out.println(cnt1);
		sc.close();
	}

}
