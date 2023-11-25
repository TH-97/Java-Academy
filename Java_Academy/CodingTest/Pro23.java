package test;

import java.util.Arrays;

//저의 숫자 30
public class Pro23 {
	public static void main(String[] args) {
		int n = 10;
		int answer = 0;
		
		int[] n_del3 = new int[n];
		
		int count = 0;
		for(int i = 1 ; i <= n ; i ++) {
			n_del3[count] = i;
			if( i % 3 == 0 || i % 10 == 3) {
				i++;
				n_del3[count] = i;
				n++;
			}
			count++;
		}
		System.out.println(Arrays.toString(n_del3));
	}

}
