package day02;

public class WhileEx4 {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int i = 0; // 증가할 값
		int total = 0; // 합계변
		while(i < arr.length) { // 배열의 끝이 정해지지 않았을때
			
		System.out.println("인덱스" + i + "의 값:" + arr[i]);
		
		total = total + arr[i];
			
			i++;
		} System.out.println("배열 요소의 합:" + total);
	}

}
