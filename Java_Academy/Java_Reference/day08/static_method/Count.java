package day08.static_method;

public class Count {
	
	public int a;
	public static int b;
	
	// 일반 메서드 - 일반변수,정적변수 모두 사용이 됩니다.
	public int method() {
		a = 10;
		b++;
		return b;
	}
	// static 메서드
	public static int method1() {
		//a = 10; 이렇게는 쓸수 없지만 방법은 있다
		// 객체를 생성해서는 접근이 됩니다.
		Count c = new Count();
		
		c.a =10;
		b++;
		return b;
	}
	
}
