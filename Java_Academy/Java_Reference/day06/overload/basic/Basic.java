package day06.overload.basic;

public class Basic {
	/*
	 * 오버로딩 - 같은 메서드를 여러개 만드는 것
	 * 규칙
	 * 1.이름이 똑같음
	 * 2.반환유형 오버로딩에 영향을 미치지 않는다
	 * 3.매개변수 타입 or 종류 or 순서를 다르게 해야합니다
	 * 
	 */
	
	void input(int a) {
		System.out.println("정수 1개 입력 받음");
	}
	
//	int input(int a) { // 반환유형 input(매개변수) 설명:반환유형이 달라도 매개면수가 같아서 되질않음
//		return 0;			
//	}
	void input(int a,int b) { // 이것은 왜 될까? :  반환유형이 다르고 매개변수가 달라서 가능하다
		System.out.println("정수 2개 입력 받음");
	}
	void input(String a, double b) {
		System.out.println("문자열 1개 ,실수 1개를 입력받음");
	}
	void input(double a , String b) {
		System.out.println("실수 1개, 문자열 1개를 입력 받음");
	}

}
