package day09.abs.good;

public abstract class Store {
	
	//추상메서드를 쓰지 않는다면..?
	
	/*
	 * 추상클래스
	 * 1.쿨래스에 absrac를 붙이며 추상클래스가 됩니다.
	 * 2.메서드에 abstract를 붙이면 추상메서드가 됩니다.
	 * 3.추상메서드는 {}	가없는 메서드의 선언 입니다.
	 * 4.추상메서드는 추상클래스에서만 선언이 가능
	 * 5.추상클래스도 생성자, 일반메서드.멤법녀수 모두 가질수 없다
	 */	
	
	private String name = "호식이 과일 가게";
	
	public Store() {
		System.out.println("추상클래스의 생성자 호출됨");
	}
	public abstract void apple();
	public abstract void melon();
	public abstract void orange();
	
	public final void mango() { //	오버라이드 금지
		System.out.println("본점에서 1000원 고정가격입니다");
	}
	public String getName() {
		return name;
	}
}
