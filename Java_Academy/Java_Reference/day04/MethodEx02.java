package day04;

public class MethodEx02 {
	public static void main(String[] args) {
		
	
	/*
	 * 	매개변수는 메서드가 전달받는 필요한 값
	 * 	메서드의 ()안에 타입과 함께 나열해주면 됩니다.
	 */
		
		int result = calc(10);
		System.out.println(result);
		
		int result1= calc2(1,10);
		System.out.println(result1);
		
		System.out.println(calc3(1,2,"A"));
		
	}
	// 반환유형 이름 (매개변수) {} - 매개변수는 언제든 메서드 안에서 활용가능
	static int calc(int a) {
		
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			sum += i;
		}
		return sum;
	}
	
	static int calc2(int a,int b) {
		
		int sum = 0;
		for(int i =a; i <= b; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	static String calc3(int a, int b, String c) {
		
		String j = "";
		for(int i = a; i <= b;	i++) {
			 j += c;
		}
		
		return j;
	}
}
