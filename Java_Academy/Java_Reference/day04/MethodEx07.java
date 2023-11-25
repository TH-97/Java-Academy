package day04;

import java.util.Arrays;

public class MethodEx07 {
	
	public static void main(String[] args) {
		
		//배열의 한계점 -> 크기가 고정
		//Stack - LIFO (Last in First Out) //변수 저장 공간
		
		//push - 값을 마지막에 하나 추가
		//pop - 값을 마지막에서 하나 제거 하고 반환
		
		push(10);
		push(20);
		push(30);
		System.out.println(Arrays.toString(arr));
	}
	static int[] arr = {1,2,3,4,5};
	//추가
	static void push(int data) {
		//1.배열의 크기를 +1 시킴
		int[] temp = new int[arr.length+1];
		//2.배열의 요소를 1번에 옮겨 담는다.
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		//3.마지막에 추가 //문자열의 추가
		temp[temp.length -1] = data;
		//4.원본 배열을 새로운 배열로 변경
		arr = temp;
		temp = null; //temp삭제
	}
	//제거
	static int pop() {
		int del = arr[arr.length-1];
		if(arr.length > 0) {
		
			//1.삭제할 값 부터 백업

			//2.원본 배열의 크기 -1 인 배열을 생성
			int[] temp = new int[arr.length-1];
			//3.값을 옮겨담는다
			for(int i =0; i < temp.length; i++) {
				temp[i] = arr[i];
			}
			//4. 원본배열에 사본배열을 넣는다
			arr = temp;
			temp = null;
		}
		return del;
	}
}
