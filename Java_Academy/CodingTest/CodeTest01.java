package test;

import java.util.Scanner;

public class CodeTest01 {
	public static void main(String[]args) {
		/*
		 *  정수 l과 r이 주어 졌을때 l이상 r이하의 정수 중에서 숫자 0,5로만 이루어진모든 정수를
		 *  오름차순으로 저장한 배열을 리턴하는 solution 함수를 완성하시오
		 *  
		 *  만약 그러한 정수가 없다면 -1이 담긴 배열을 리
		 */
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int count_siz = 1;
		int count = 0;
		int[] answer = new int[count_siz];

		for(int i = l; i <= r;i++) { // l ~ r 까지 반복
			String i_string = Integer.toString(i);
			System.out.println(i_string);
			if(i_string.equals ("0") || i_string.equals ("5")) { //10의 자리를 못넣
				 int i_int = Integer.parseInt(i_string);
				 answer[count] = i_int;
				 count++;
				 count_siz++;
			}
		}
		 System.out.println(count);
		 System.out.println(count_siz);
		sc.close();
	}

}
