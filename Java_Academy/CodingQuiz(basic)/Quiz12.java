package quiz01;

public class Quiz12 {
	public static void main(String[] args) {
		// 자판기
		//동전
		
		int[] arr = {1000, 500, 100, 50, 10};
		// 금액
		int money = 17780; // 1000원짜리 17, 500짜리 1개, 100원2개, 50원 1개, 10원 3개
		
		int i = 0; //증가
		int count = 0; //카운트
		while(i < arr.length ) {
			
			count = money / arr[i];
			money = money - arr[i] * count;
			
			/*
			 * money = money % arr[i];
			 */

			System.out.print(arr[i] + " " + count);
			System.out.println();
			i++;
		}
		
		
	}

}
