package day03;

import java.util.Arrays;

public class ArraySort2 {
	public static void main(String[] args) {
		
		//버블정렬 - 큰 값을 뒤로 보낸다.
		
		int[] arr = {5,23,1,43,200,100,40};
		
		/*
		 * 5,1,23,43,100,43,200 - 1회전
		 * 1,5,23,43,40,100,200
		 * 1,5,23,40,43,100,200 - 3회
		 * 
		 */
		
		
		for(int i = 0; i < arr.length - 1;i++) { //회전수를 의미
			
			for(int j = 0; j < arr.length-i-1; j++) { //값의 비교를 위한 반복문
				
				if(arr[j] > arr[j+1]) {
					int temp =arr[j];
					arr[j] = arr[j + 1];
					arr[j+1] = temp;
				}
			}
			
		}System.out.println( Arrays.toString(arr));
		
		//퀵정렬
		int[] arr2 = {5,23,1,43,200,100,40};
		Arrays.sort(arr2); //정렬해준다
		System.out.println(Arrays.toString(arr2));
		
		String[] arr3 = {"수박", "멜론","오렌지"};
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		
		
	}

}
