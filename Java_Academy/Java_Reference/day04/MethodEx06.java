package day04;

public class MethodEx06 {
	public static void main(String[] args) {
		//메서드의 연쇄 호출(동기적 처리)
		test01();
		
		//메서드의 재귀함수
		
		recursive(1);
	}

	
	static void test01() {
		System.out.println("test01시작");
		test02(); // 번 메서드 호출
		System.out.println("test01");
	}
	static void test02() {
		System.out.println("tesr02시작");
		System.out.println("tesr02끝");
	}

	static void recursive(int a) {
		
		//재귀는 반복과 비슷 결국 탈출의 조건을 주면 됨
		if(a == 10) return;
		
		a++; //1증가
		recursive(a);
	}
}
