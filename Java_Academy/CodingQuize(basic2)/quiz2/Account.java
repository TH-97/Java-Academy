package quiz2;

public class Account {
	/*
	 * 	1. 멤버 변수- 예금주이름(name : String), 비밀번호(password : String), 잔액(balance: int) 로 선언하세요.

		2. 생성자 - 3가지 멤버 변수를 모두 매개값으로 받아 초기화하는 생성자를 선언하세요.


		3. 메서드 - 
				입금기능 메서드(deposit : void), 
        출금기능 메서드(withDraw: void), 
				잔액 조회 메서드(getbalance: int)
	 */
	String name;
	String password;
	int balance;
	Account() {
	}
	
	Account(String name_1,String password_1,int balance_1){
		name = name_1;
		password = password_1;
		balance = balance_1;
	}
	
	void info() {
		System.out.println("이름:" + name);
		System.out.println("잔액:" + balance);
	}
	
	void deposit(int money) {
		System.out.println("입금:"+(balance += money));
	}
	void withDraw(int money) {
		System.out.println("출금:" + (balance -= money));
	}
	int getvalance() {
//		int money = 0;
//		System.out.println("잔액:" + balance);
//		return money + balance;
		return balance;
	}
	
}
