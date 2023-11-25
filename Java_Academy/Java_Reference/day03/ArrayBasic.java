package day03;

import java.util.Arrays;

public class ArrayBasic {
	public static void main(String[] args) {
		
		//배열의 개념
		//배열 만드는 법 2가지
		
		int[] arr =new int[3];
		arr[0] = 100;
		arr[1] = 100;
		arr[2] = 100;
		
		//배열의 내부를 문자열로 확인
		System.out.println(Arrays.toString(arr));
		
		//배열의 길이를 확인하는 속성
		System.out.println(arr.length);
		
		//배열의 순회 (회전)
		
		int sum =0;
		int i = 0;
		while(i < arr.length) {
			System.out.println("인덱스" + i +"의 값" + arr[i]);
			sum = sum + arr[i]; // 배열요소의 
			i++;
		}
		System.out.println("배열요소의 합"+ sum);
	}

}
