package day05;

public class Variable {
	
	//멥버변수는 객체로 생성될 때 자동 초기화 들어갑니다. 각자의 초기값이 들어감
	int a;
	
	void printNum(int c) {
		int b = 1; // 지역변수라서 초기값을 넣어줘야 함
		
		System.out.println("멤버변수:" + a ); //멤버변수 이므로 초기값이 들어간다
		System.out.println("지역변수:" + b );
		System.out.println("매개변수:" + c ); // 값을 넣어주지 않으면 값이 출력되지 않음
	}

}
