package day08.static_.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * 녹색 계산기 1개, 빨강색 계산기 1개 생성
		 * 걔선가 색상 확인
		 * add(inta)메서드를 추가(result누적)
		 * pi변수를사용해서 원의 너비
		 * circle() 사용해서 원의 넓이
		 */
		Calculator green = new Calculator();
		green.setColor("green");
		Calculator red = new Calculator();
		red.setColor("red");
		System.out.println(green.getColor());
		green.add(1);
		
		//static변수 ,static 메서드
		double p = 1 * 1 * Calculator.pi;
		
		System.out.println(p);
		
		Calculator.circle(1);
		
		System.out.println("---");
//	 	정적 초기화자는 클래스가 불려나올때 단 1번만 실행
//		Computer com1 = new Computer(1000);
//		Computer com2 = new Computer(1000);
		
		System.out.println(Computer.company);
		
	}

	

}
