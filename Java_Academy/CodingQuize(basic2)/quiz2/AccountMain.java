package quiz2;

public class AccountMain {
	public static void main(String[] args) {
		Account ac = new Account("윤태훈","패스워드",100);
		ac.info();
		ac.deposit(200000);
		ac.withDraw(100000);
		ac.getvalance();
	}

}
