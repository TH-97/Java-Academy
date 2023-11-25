package day08.static_.basic;

public class Computer {
	
	public static String company;  //동일한 회사
	public int price;
	
	//정적 초기화자 -단 1번만 실행됩니다
	static {
		//static 블럭에서는 this 키워드 사용불가
		company = " L G ";
		System.out.println("정적 초기화가 1번 실행됨");
	}
	
	public Computer(int price) {
		this.price  = price; // 일반 변수 초기화

	}

}
