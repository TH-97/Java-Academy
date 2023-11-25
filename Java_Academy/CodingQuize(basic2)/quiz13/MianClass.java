package quiz13;

public class MianClass {
	public static void main(String[] args) {
		
		// 카트 생성
		MyCart cart = new MyCart(100000);
		
		
		cart.buy(new Tv());
		cart.buy(new Radio());
		cart.buy(new Computer());
		
		cart.info();
		
	}

}
