package quiz13;

public class MyCart {
	//1. 모든 변수와 메서드에 접근제한자를 선언하세요.
	private int money;
	private Product[] cart = new Product[1]; //상품을 저장할 배열
	private int i = 0;
	
//	Product com = new Computer();
//	Product radio = new Radio();
//	Product tv = new Tv();
//	Product pro = new Product();
	
	//2. MyCart의 생성자는 money만 받아서 초기화
	public MyCart(int money){
		//setMoney(money);
		this.money = money;
		}

	
	/*
	 * 3. buy(모든 상품을 받도록 선언)
	 * 
	 * 가진돈과 전달된 물건의 가격을 비교해서 돈이 적으면 "금액부족" 출력후 종료
	 * 가진돈이 충분하면 물건의 가격을 money에 빼고  add(상품) 메서드를 호출
     */ 
	public void buy(Product pro) {

//			if(pro instanceof Tv) {
//				setMoney(getMoney() - tv.price);
//				add(pro);
//				
//			}if(pro instanceof Radio) {
//				setMoney(getMoney() - radio.price);
//				add(pro);
//			}if(pro instanceof Computer) {
//				setMoney(getMoney() - com.price);
//				add(pro);
//			}
		
		//같은 클래스 안에 있으므로 get set을 쓸필요가 없다
		// 만약 다른 클래스에서 값을 변경하거나 가져오고 싶으면
		// get set 을 선언해서 값을 변경하거나 가져와라
		if(this.money < pro.price) {
			System.out.println("금액부족");
			return;
		}
		this.money -= pro.price;
		add(pro);
	}

	/*
	 * 4. add(모든 상품을 받도록 선언)
	 * 만약 i의 값이 장바구니의 크기보다 같거나 크다면
	 * 기존의 장바구니보다 크기가 * 2큰 배열을 생성.
	 * 기존의 장바구니 값을 새로운 배열에 복사.
	 * 새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 
	 * 상품을 장바구니에 담는다.
	 * 
	 */
	private void add(Product pro) {
//			if(getI() >= cart.length) {
//				Product[] cart_copy = new Product[cart.length *2];
//				if(pro instanceof Tv) {
//					cart_copy = tv.name;
//					
//				}if(pro instanceof Radio) {
//					cart_copy = radio.name;
//				}if(pro instanceof Computer) {
//					cart_copy = com.name;
//				}
//				cart = cart_copy;
//		}
		if(this.i >= cart.length) {
			Product[] cart_copy = new Product[cart.length * 2];
			
			for(int i = 0; i < cart.length; i++) {
				cart_copy[i] = cart[i];
			}
			cart = cart_copy; //주소변경
			cart_copy = null;
		}
		cart[i] = pro;
		i++;
	}
	
	/*
	 * 5.info()
	 * 장바구니 안에 담긴 물건의 목록(name)을 출력한다.
	 * 남은금액 출력
	 * 메인에서 buy메서드 실행 
	 * 
	 */
	public void info() {
		String str  = "";// 문자열 출력
		int sum = 0;       // 금액 총합
		for(int j = 0; j < this.i;j++) {
			str += cart[j].name + " "; //주소값
			sum += cart[j].price; //금액 총합
		}
		
		System.out.println("목록:" + str);
		System.out.println("총금액:" + sum);
	}
	
}
