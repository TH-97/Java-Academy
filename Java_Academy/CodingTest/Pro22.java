package test;

import java.util.Arrays;
//실패율

public class Pro22 {
	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		int[] answer = new int[N];

		double[] fals = new double[N]; //실패율 배열

		int a = stages.length; // 
		int[] counter = new int[N]; //카운트 배열
		
		for(int j = 1; j <= N; j++) { //카운트 배열 만들기
			for(int i = 0 ; i < stages.length;i++ ) { 
				if(stages[i] == j) {
				counter[j-1]++;
				}
			}
		}
		for(int i = 0; i < N;i++) { //실패율 배열에 넣기
			fals[i] = counter[i] / a - counter[i-1];
		}
		
			

//		for(int i = 0; i < fals.length; i++) { // 넣어줄것 반복
//	   
//			}
//	
//        
//		System.out.println(Arrays.toString(fals));

	}

}
