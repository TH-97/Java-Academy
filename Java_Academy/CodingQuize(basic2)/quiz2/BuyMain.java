package quiz2;

public class BuyMain {
	public static void main(String[] args) {
		/*
		 * 일상생활에서 객체로 표현할 수 있을 법한 기능. 클래스로 설계
		 * ex) tv,리모컨 환률계산기
		 * 메서드는 3개정도
		 * 
		 * 구매 서비스
		 * 회원 이름
		 * 비밀번호
		 * 충전금액
		 * 
		 * 구매
		 * 환불
		 * 남은 금액
		 * 
		 */
		
		Buy me = new Buy("윤태훈",123,100000);
		
		me.list();
		me.buying("냉장고");
		me.buying("컴퓨터");
		me.refund("냉장고");
		me.change_1();
	}

}
