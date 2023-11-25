package day05;

public class VarMain {
	public static void main(String[] args) {
		Variable var = new Variable();
		
		var.a = 10; // 멤버 변수인 a는 클래스 외부에서 값을 지정해 줄 수 있다
		System.out.println(var.a);
		
		var.printNum(200);
		
	}

}
