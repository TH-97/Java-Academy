package test;

import java.util.Scanner;

public class Main2566 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		//배열에 넣기
		int[][] arr = new int[9][9];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		//배열에서 비교하기
		int a = 0;
		int b = 0;
		int num = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				if(num < arr[i][j]) {
					num = arr[i][j];
					a = i+1;
					b = j+1;		
				} if(num == arr[i][j]) {
					a = i + 1;
					b = j + 1;
				}
			}	
		}System.out.println(num);
		System.out.println(a + " " + b);
		sc.close();
	}

}
