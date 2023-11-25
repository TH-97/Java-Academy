package quiz01;

public class Quiz13 {
	public static void main(String[] args) {
		//거꾸로 실행되는 랜덤 구구단 ^0^
		//구구단 2단
		//거꾸로 구구단
		
		System.out.println("거꾸로 실행되는 랜덤 구구단 ^0^");
		int number = (int)(Math.random()*9) + 1;
		System.out.println("구구단"+number+"단");
		
		for(int i = 9; i >= 1; i--) { 
			System.out.println(number + "x" + i +"="+ number * i );
		}
		
		
		
	}

}
