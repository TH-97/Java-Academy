package quiz;

import java.util.Arrays;

public class Quiz24 {
	public static void main(String[] args) {
		int[] arr = {100,200,300,400,500};
		
		//배열의 길이는 고정이라서 끝에 추가하는 작업이 불가
		
		int value = 600;
		
		/*
		 * 배열의 끝에 600의 값을 추가하려고 합니다.
		 * 새로운 배열 +1을 만든다
		 * 기존 배열의 값을 옮겨 담는다
		 * 마지막에 value를 추가한
		 */
		
		int[] arr_copy = new int[arr.length + 1];
		
		for(int i = 0; i < arr.length; i++) {
			arr_copy[i] = arr[i];
			}
		arr_copy[arr_copy.length -1] = value;
		System.out.println(Arrays.toString(arr_copy));
		
		//이번에는 앞에 700을 추가하자
		
		int[] arr2 = {10,20,30,40,50,0};
		
		int[] arr2_copy = new int[arr2.length];
		
		for(int i = arr2.length -1; i > 0; i--) {
			arr2_copy[i] = arr2[i - 1];
		}
		arr2_copy[0] = 700;
		System.out.println(Arrays.toString(arr2_copy));
	}

}
