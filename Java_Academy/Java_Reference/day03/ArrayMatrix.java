package day03;

import java.util.Arrays;

public class ArrayMatrix { //행
	public static void main(String[] args) {
		
		// 2차원배열 - 배열안에 배열이 들어간다
		// {{1,2,3},{1,2,3},{1,2,3}}
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		
		//인덱스의 접근
		
		
		//2차원 배열에 순차적 접근
		//행
		for(int i = 0; i < arr.length;i++) {
			//열
			for(int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]);
			}
			//2차원 배열을 만드는 방법2
			// 대괄호를 2개 찍는다
		}	
			int[][]	 ar = new int[3][4];
			
			int count = 1;
			//ar 2차원 배열에 1~12까지 값을 순서대로 저장
			for(int i = 0; i < ar.length;i++) {
				for(int j = 0; j < ar[i].length; j++) {
					ar[i][j] = count++; //값을 대입하고 증
					System.out.print(ar[i][j]);
				}
			} // 2차원의 배열의 값을 문자열로 출력
				System.out.println(Arrays.deepToString(ar));
		
 	}

}
