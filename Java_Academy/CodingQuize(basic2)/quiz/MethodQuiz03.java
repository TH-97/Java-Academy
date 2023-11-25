package quiz;

public class MethodQuiz03 {
	public static void main(String[] args) {
		
		//1. 매개변수 n을 받아서, n까지 약수의 합을 리턴하는 sum();
		//2. 두 수를 매개변수로 받아서, 두 수 사이의 합 리턴 sum2();
		// > 두 수의 크기는 정해지지 않음 sum2(1,10), sum2(10,2) 값이 같아야함
		// 약수의 합 구하기
		
		/*
		 * 1. java함수는 매개변수로 숫자를 받습니다
		 * 2. 매개변수 숫자길이만큼 패턴 "자바자바자바.."를 리턴 하는 함수를 완성하세요1
		 * 1이면 자
		 * 2이면 자바
		 * 3이면 자바자
		 */
		System.out.println(sum(10));
		System.out.println(sum2(1,10));
		System.out.println(sum_java(5));
		
	}
	static int sum(int num) {
		int total = 0;
		for(int i = 1; i <= num;i++) {
			if(num % i  == 0) {
				total += i;
			}
		}
		return total;
	}
	static int sum2(int num,int num2) {
		int total = 0;
		if(num < num2) {
			for(int i = num; i <= num2; i++) {
				total += i;
			}
		}if(num > num2) {
			for(int j = num2; j <= num;j++) {
				total += j;
			}
		}
		return total;
	}
	
	static String sum_java(int num) {
		String str = "";

		for(int i = 1; i <= num; i++) {
			if(i % 2 != 0) {
				str = str + "자";
			}else {
				str = str + "바";
			}
		}return str;
		
	}
}
