package day01;

public class Operation01 {
	public static void main(String[] args) {
		
		//단항 연산자
		
		//부호 연산자
		
		//증감 연산자 ++,--
		
		int k = 1;
		
		int h = k++; //후위연산 -> 대입, 그 다음에 자신 증가.
		
		System.out.println(k); //2
		System.out.println(h); //1
		
		int x = 1;
		int y = ++x; //전위연산 ->먼저 값을 증가 그 다음에 대입.
		
		System.out.println(x); //2
		System.out.println(y); //2
		
		//일반적인 사용
		
		x = 1;
		x++;
		++x;
		System.out.println(x);
		
		x = 1;
		System.out.println(x++); //1
		System.out.println(++x); //3
		
		//비트연산자 ~(많이 사용x)
		byte b = 10; // 0000 1010
		
		
		System.out.println(~b);// 1111 0101
		
		//논리 반전연산 ! (영어로 not)
		System.out.println(!true); //false
		boolean bool = !false; 
		System.out.println(bool); //true
		
		//산순연산
		int i = 7 / 3; // 2
		int j = 7 % 3; // 1
		int k1 = 7 * 3; // 21
		//비교연산
		System.out.println(i == j); //t
		System.out.println(i != j); //t
		System.out.println(i >= j); //t
		System.out.println(i < j); // f
		System.out.println(k1 != 21); //f
		System.out.println(k1%2== 1); //t
		System.out.println(k1%2 != 0); //t
		
		//비트연산자 1이면 true 0이면 false
	}
}
