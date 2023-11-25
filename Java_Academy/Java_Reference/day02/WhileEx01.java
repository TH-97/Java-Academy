package day02;

public class WhileEx01 {
	public static void main(String[] args) {
		
		
		int a = 1;  //제어변수 - 반복문의 횟수를 제어할 변
		while(a <=10) { // 제어 변수로 조건을 생성
			
			System.out.print(a);
			a++;//반복을 돌 때마다 제어변수를 증가해서 언젠가는 조건이 false가 되게 해야
			
		}
	}

}
