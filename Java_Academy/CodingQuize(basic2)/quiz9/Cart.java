package quiz9;

public class Cart {
	//부모클래스
	
	//멤버변수
	String[] cart = new String[1]; //장바구니
			
	int money; //잔액
	int index; //배열을 다룰 인뎃스
	
	int tv; //상품의 금액
	int com;
	int radio;
	
	void buy(String product) {
		System.out.println("재정의 하세요");
	}
	void add(String product) {
		System.out.println("재정의 하세요");
	}
	void info() {
		System.out.println("재정의 하세요");
	}
}
