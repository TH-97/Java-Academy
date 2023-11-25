package day08.static_method;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		
		//main 은 static입니다
		//a변수를 사용하고 싶으면 객체 생성을 해서 사용함
		Count c = new Count();
		c.method();  // 1
		//static멤버를 호출할 때
		Count.b++; // 2
		
		Count.method1(); //2 객체 안에 자아아아아알 봐라
		
		// 현재 b는 3
		
		Arrays.toString(null); //이것도 스태틱
		Math.random();// 이것도 스태틱
		
		
	}

}
