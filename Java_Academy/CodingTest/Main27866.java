package test;

import java.util.Scanner;

public class Main27866 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String[] str_copy = str.split("");
		int num = sc.nextInt();
		
	    System.out.println(str_copy[num - 1]); 
		sc.close();
	}

}
