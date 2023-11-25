package test;

import java.util.Scanner;

public class Main2743 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String str_split = str.strip();
		
		int count = 0;
		
		for(int i = 0; i < str_split.length(); i++) {
			count++;
		}
		
		sc.close();
		System.out.println(count);
		
	}

}
