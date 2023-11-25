package day08.static_.singleton;

public class MainClass {
	public static void main(String[] args) {
		
	Person p = Person.getPerson();
	Person p2 = Person.getPerson();
	
	System.out.println(p); //결론 둘다 같은 주소값이 나온다 결국 객체는 1개
	System.out.println(p2);
	
	p.setName("홍길동");
	System.out.println( p.getName() ); //홍길동
	System.out.println( p2.getName() ); //홍길동
	}

}
