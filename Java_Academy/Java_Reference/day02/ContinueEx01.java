package day02;

public class ContinueEx01 {
	public static void main(String[] args) {
		
		//continue는 반복문의 다음으로 갑니다.
		
		for(int i = 1; i<=10;i ++) {
			if (i ==5) {
				continue;
			}
			System.out.println();
		} 
		System.out.println("---");
		
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			if(i == 5) {
				continue;
			}
			System.out.println(i);
			i++;
		}
		
	}

}
