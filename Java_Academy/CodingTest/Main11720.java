package test;

import java.util.Scanner;

public class Main11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int N = sc.nextInt();
		String N_str = sc.next();
        
		for(int i = 0; i < N; i++) {
			// charAt으로 문자로 바꿔주서 더하는데 -0을 하는 이유는
			// +0을 하게되면 뒤에 0이 하나 더 붙게 되기때문이
			total += N_str.charAt(i)-'0';
		}
		System.out.println(total);
		sc.close();
	}
}
