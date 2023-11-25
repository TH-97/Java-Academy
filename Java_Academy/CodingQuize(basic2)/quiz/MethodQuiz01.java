package quiz;

public class MethodQuiz01 {
	
	public static void main(String[] args) {
		
		method1();
		System.out.println(method2("하세요"));
		System.out.println(method3(1,2,1.1));
		System.out.println(method4(2));
		method5("헬로",3);
		System.out.println(maxNum(1,10));
		System.out.println(abs(-5));
		
	}
	
	static void method1 () {
		System.out.println("안녕");
	}	

	static String method2(String str) {
		return str;
	}
	
	static double method3(int a, int b, double c) {
		return a + b + c;
//		double total = 0;	
//		total = (int)(a + b + c);
//		return total;
	}
	
	static String method4(int num) {

		if(num % 2 == 0) {
			return "짝수";
		}else {
			return "홀수";
		}
		
	}
	
	static void method5(String a, int b) {
		for(int i = 1; i <= b; i++) {
			System.out.print(a);
		}
		
	}
	
	static int maxNum(int a, int b) {
		return a > b ? a : b;
		//		int max = 0;
//		if (a > b) {
//			return max = a;
//		}else {
//			return max = b;
//		}	
	}
	static int abs(int a) {
		return Math.abs(a); //절대값 함수
	}
	
}
