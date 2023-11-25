package day08.static_field;

public class MainClass {
	
	public static void main(String[] args) {
		
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		System.out.println("일반변수:" + c1.a);
		System.out.println("정적변수:" + c1.b);
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		System.out.println("일반변수:" + c2.a);
		System.out.println("정적변수:" + c2.b);
		
		Count c3 = new Count();
		c3.a++;
		c3.b++;
		System.out.println("일반변수:" + c3.a);
		System.out.println("정적변수:" + c3.b);
		
		//1. static변수 객체들 사이에서 동일한 값을 갖게 한다.
		//2. static 변수는 객체 바깥에 생성되므로, 객체 생성없이 접근이 가능하다
		
		//클래스명.변수명
		
		System.out.println( Count.b ); //3 
	}

}
