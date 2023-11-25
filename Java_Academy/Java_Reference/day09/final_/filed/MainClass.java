package day09.final_.filed;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("123123","홍길동");
		
		Person p2 = new Person("456456","이순신");
		
		//객체마다 다른값을 가지고 있을 수도 있다
		System.out.println(p1.ssn); //123123
		System.out.println(p2.ssn); //456456
		
		System.out.println(Constant.PI);
	}

}
