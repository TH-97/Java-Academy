package quiz01;

public class Quiz14 {
	public static void main(String[] args) {
		
		/*
		 * 1. 7~100까지 정수들에서 7의 배수를 가로로 출력
		 * 2. 50 ~100까지 두수 사이의 합계
		 * 3. 200까지 정수 중에서 4의 배수이면서, 8의 배수가 아닌 수 출력
		 * 4. A ... z를 붙여서 출
		 */

		for(int i = 0; i < 100;i+=7) { 
			System.out.print(i + " ");
		}
		System.out.println();
		
		int total = 0;
		for(int i = 50; i < 100;i++) {
			total = total + i;
		}System.out.println(total);
		
		for(int i = 0; i <= 200;i++) {
			if(i % 4 ==0 && i % 8 != 0) {
					System.out.print(i + " ");
				
			}
		}System.out.println();
		for(char i = 65; i<=90; i++) {
			System.out.print(i);
		}
		//배열의 요소중에서 짝수의 합계
		System.out.println();
		int[] arr = {23,54,34,23,22,20,30};
		
		int total1 = 0;
		for(int i = 0; i <= arr.length ;i++) {
			if(i % 2 == 0) {
				total1 = total1 + arr[i];
			}
			
		}System.out.print(total1);
	}

}
