package quiz;

import java.util.Arrays;

public class Quiz15 {
	public static void main(String[] args) {
		
		/*
		 * 절대 중복되지 않는 값을 가지고 있는 길이가 3인 배열 만들기
		 * 
		 * 랜덤수 2개를 생성해서, arr배열을 랜덤 하게 10번 섞어 줍니다
		 * 0~2 번째 인덱스 값을 가지는 새로운 배열로 옮겨담아 보세요.
		 */
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] arr0 = new int[3];
		
		for(int i = 0; i <= 10;i++) {
			int ran = (int)(Math.random() * arr.length);
			int ran0 = (int)(Math.random() * arr.length);
			
			int tmp = arr[ran];
			arr[ran] = arr[ran0];
			arr[ran0] = tmp;
			
			arr0[0] = arr[0];
			arr0[1] = arr[1];
			arr0[2] = arr[2];
		}
		System.out.println(Arrays.toString(arr0));
		
		
		
	}

}
