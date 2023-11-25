package api.generic.good;

public class MainClass {
	public static void main(String[] args) {
		//이렇게는 잘 안쓴다
//		ABC abc = new ABC();
//		abc.setT("홍딜동");
		
		//String을 저장하는 용도의 객체
		ABC<String> abc = new ABC<String>();
		abc.setT("홍딜동");
		
		String name = abc.getT();
		
		System.out.println("---");
		
		//int로 저장하는 용도의 객체 ( 반드시 wrapper만 쓸수 있음)
		ABC<Integer> abc2 = new ABC<Integer>();
		
		abc2.setT(2);
		int age = abc2.getT();
		
		//Person 저장하는 용도의 객체(뒤에 제네릭 생략이 가능)
		ABC<Person> abc3 = new ABC<Person>();
		
		abc3.setT(new Person());
		Person p = abc3.getT();
		
	}

}
