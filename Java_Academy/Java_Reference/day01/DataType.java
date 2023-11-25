package day01;

public class DataType {
	
	public static void main(String[] args) {
		
		byte a = -128; // -128 ~ 127
		short a1 = -32768; // -32768 ~32767
		
		int a3 = -2147483648; // -2147483648 ~ 2147483647
		
		long a5 = 5834572308455345L;
		
		//2진수 - 0b
		//8진수 - 0
		//16진수 - 0x
		
		System.out.println("--------------------------------------------");
		
		float b1 = 3.141592F; //float 은 F를 붙입니다
		double b2 = 3.14159211111;
		
		System.out.println(b1);
		System.out.println(b2);
		
		double b3 = 0.000314e4;
		double b4 = 314.15e-2;
		
		System.out.println(b3);
		System.out.println(b4);
		
		System.out.println("--------------------------------------------");
		
		//boolean T/F 
		
		boolean c1 = true;
		boolean c2 = false;
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("-------------------------------------------");
		
		//문자 타입
		//char - '한' -2byte
		//String - "문자열
		
		char d1 = 'a';
		char d2 = 65;
		
		System.out.println(d1);
		System.out.println(d2);
		
		//문자열
		String s1 = "hello";
		String s2 = "world";
		
		//문자열의 연산
		//문자열 + 로 붙이면 문자열을 붙인 결과를 가져옵니다.
		System.out.println(s1 + s2);
		
		//문자열과 서로 다른타입의 + 연산 = 결과는 무조건 문자
		System.out.println(200 + 200);
		System.out.println(200 + "200");
		System.out.println(200 + 200 + "200"); //400200200
		System.out.println("200" + 200 + 200); //200200200
		
		//??
		System.out.println("A" + 10); //A10
		System.out.println('A' + 10); //75
		
	}

}
