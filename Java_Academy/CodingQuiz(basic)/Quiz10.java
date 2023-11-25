package quiz01;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		//어떤 수를 입력 받아습니다.- 이렵한 수의 약수의 합계 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하시오.>");
		int a = sc.nextInt(); //입력한 수 
		int b = 1; //증가할 
		int rel = 0; //결과 값
		while(b <= a  ) {
			if(a % b == 0) {
				rel = rel + b;
			}
			b++;
			
		} System.out.println("결과값:" + rel);
		sc.close();
	} 

}
