package quiz01;

import java.util.Scanner;

public class Quzi04 {
	public static void main(String[] args) {
		//>50
		//>46
		//무엇이 큰수인가
		//같은 수일 경우 같은 수 입니다 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">");
		int a = sc.nextInt();
		System.out.print(">");
		int b = sc.nextInt();
		
		if (a > b) {
			System.out.println( a + "가 큽니다.");
	    }else if(b > a) {
	    	System.out.println( b + "가 큽니다.");	    	
	    }else {
	    	System.out.println("같은 수 입니다.");
	    }sc.close();
	}
}
