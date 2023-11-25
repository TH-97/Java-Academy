package day01;

public class Casting03 {
	public static void main(String[] args) {
		
		//연산이 일어났을 때 형변환
		System.out.println('A' + 10);
		
		//1. 서로 다른타입의 연산에서 큰 타입에 맞추어 자동 형변환 된다.
		
		char c = 'B';
		int i = 2;
		
		char cc = (char)(c + i); // 한번 생각해보기
		
		int ii = c + i; // ok
		
		//2. int 형보다 작은 타입의 연산은 무조건 int가 됩니다.
		
		byte b1 = 100;
		byte b2 = 3;
		byte b3 = (byte)(b1 + b2);
		
		System.out.println('A' + 10); // 왜 75가 나올까 생각해보기.
		
	}
}
