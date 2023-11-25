package day05.str_ex;

public class StringExample {
	public static void main(String[] args) {
		//문자열은 참조타입입니다.
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		//동일한 메서드안에서 동일문자열 선언하면, 동일한 주소를 가르키게 됩니다.
		//만약 직접 String객체 생성을 하거나, 다른곳에서 넘어 다른주소를 가르키게 됩니디
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str1 == str2); // true  실제 주소값 비교
		System.out.println(str1 == str3); //false 실제 주소값 비교
	}
}
