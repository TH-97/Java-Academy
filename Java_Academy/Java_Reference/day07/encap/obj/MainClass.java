package day07.encap.obj;

public class MainClass {
	
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		
		//setter메서드의 사용법 이 안에서는 사용할피요가 없긴하다
		//1번째 방법
		//hotel.setChef(new Chef());
		
		//2번째 방법
		Chef c = new Chef();
		hotel.setChef(c);
		
		//getter 메서드의 사용법
		Chef chef  = hotel.getChef();
		chef.cooking();
	}

}
