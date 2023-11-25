package day02;

public class DoWhileE0x1 {
	public static void main(String[] args) {
		
		//while문으로 1~10까지 합계
		
		int i = 1;
		int sum = 0; // 누적변
		while(i <=10) {
			sum = sum + i;
			i++;
		}
		System.out.println("합계:" + sum);
		
		int x = 1;
		int sum2 = 0;
		do {				// 무조건 한번을 실행
			sum2 = sum2 + x;
			x++;
		} while (x <= 10);
		System.out.println("합계:" + sum2);

	}

}
