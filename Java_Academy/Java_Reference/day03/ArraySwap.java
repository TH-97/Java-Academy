package day03;

public class ArraySwap {
	public static void main(String[] args) {
		
		// 배열의 값을 서로 바꾸는 작업
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		//랜덤하게 2개의 인덱스를 생성
		int i =(int)(Math.random()* arr.length);
		int j =(int)(Math.random()* arr.length);
		
		//자리바꾸기
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
