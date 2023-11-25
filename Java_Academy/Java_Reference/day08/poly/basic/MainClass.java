package day08.poly.basic;

public class MainClass {
	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.method01(); //상속받은 
		child.method02(); //오버라이드 된 메서드
		child.method03(); // 자식의 메서드
		
		//다형성
		//부모님이 가진 메서드만 사용가능함
		//단, 오버라이딩 된 메서드는 먼저 실행됩니다.
		Parent p  = child;
		p.method01();
		p.method02();
		
		/*
		 * 다형성으로 객체 형변환이 일어나면 자식 타입의 메서드를 사용 할수없는 문제가 발생
		 * ㅋ
		 * 클래스 캐스팅() = 다시 원래 타입으로 면환이 가능합니다.
		 * 
		 */
		Child cc = (Child)p; //p는 다형성이 적용 되었던 변수
		cc.method01();
		cc.method02();
		cc.method03();
		///// 다형성이 일어나지 않은 객체를 대상으로 형변환을 하면 헤러가 발생합니다
		Object o =  new Object(); //o 는 String의 s도 없는 친구
		String = (String)o;
	}

}
