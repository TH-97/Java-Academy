package test;

import java.util.Scanner;

public class Test2562 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		for(int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int num = 0;
		
		for(int i = 0; i <= arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				num = i+1;
			}
		}System.out.println(max);
		System.out.println(num);
		sc.close();
		

		
		
	}

}
