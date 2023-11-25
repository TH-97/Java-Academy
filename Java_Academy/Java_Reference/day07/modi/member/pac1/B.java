package day07.modi.member.pac1;

public class B {
	
	A a = new A(1); //변수가 파란색이므로 멤버변수	 public(o)
	A a2 = new A(true);                    // default(o)
	A a3 = new A("홍길동");                 // private(x)
	
	//생성자의 private를 붙여서 외부에서 객체 생성을 못하도록 처리하기도 함
	
	//-----
	
	public B() {
		A a = new A();
	}

}
