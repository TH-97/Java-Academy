package test;

import java.util.Scanner;

public class Main10813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] box = new int[n];
//		int ball = 1;
//		for(int i = 0; i < n ; i++) {
//			box[i] = ball;
//			ball++;
//		}
		for(int i = 0; i < box.length;i++) {
			box[i] = i + 1;
		}
		int m = sc.nextInt();
		for(int num = 0; num < m; num++) {
			int i = sc.nextInt();
			int j = sc.nextInt();

			int temp = box[(j - 1)];
			box[(j - 1)] = box[(i - 1)];
			box[(i - 1)] = temp;
		}
//		for(int i = 0; i < n; i++) {
//		System.out.print(box[i]+ " ");
//		}sc.close();
		//출
		String str = " ";
		for(int i = 0; i < box.length; i ++) {
			str += box[i];
			if(i == box.length) {
				str += " ";
			}
		} System.out.println(str);
		sc.close();
	}

}
