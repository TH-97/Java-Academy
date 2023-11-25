package day04;

import java.util.Arrays;

public class StringMethod {
	public static void main(String[] args) {
		//문자열 다루기 메서드 - (뒤에서도)
		//문자열"ABC"
		
		String str = "ABC";
		char[] arr = {'A','B','c'};
		
		String str2 = new String(arr);
		
		System.out.println(str); //ABC
		System.out.println(str2); // ABC
		
		//문자열은 인덱스가 존재함 시작은 0
		
		//문자열 다루기 메서드 - 문자열.메서드명()
		
		//1. 문자열의 길이
		str = "안녕하세요";
		
		int result = str.length();
		System.out.println(result);
		//2.인덱스 번호 위치를 잘라서 char형 반환
		char a = str.charAt(0);
		System.out.println(a);
		//3.문자열 자르기 substring()
		String b = str.substring(3); //인덱스 미만 절살
		System.out.println(b);
		
		String c = str.substring(0, 3); //0이상 ~ 3미만 추출 (인덱스기준
		System.out.println(c);
		
		//4.문자열 자르기 split();
		str = "010-1234-5678";
		String[] d = str.split("-"); //구분자를 기준으로 잘라서 배열로 전환
		System.out.println(Arrays.toString(d));
		//5.문자열 자르기 
		char[] e = str.toCharArray(); //한글자씩 잘라서 char배열로 변환
		System.out.println(Arrays.toString((e)));
		
		//6. 문자열 찾기 indexOf()
		System.out.println(str);
		int f= str.indexOf("2"); // 가장 처음 발견된 index 반환
		System.out.println();
		
		int g = str.indexOf("헐"); //없는 값이라면 -1 을 반환
		
//		if(str.indexOf("헐") != -1 ) { //헐이 있다는 뜻			
//		}
		
		int h = str.lastIndexOf(0); //뒤에서 부터 가장 처음 발견된 index 반환
		
		//7 문자열 찾기 contains(),
		//7 문자열 찾기 startsWith()
		boolean j = str.startsWith("1234"); // 문자열이 1234로 시작하는지
		
		// 문자열 치환 replace()
		// 공백 없애기 str.replace(" ","");
		
		// 양측 공백 삭제 trim()
		str = " 안녕하세요 오늘은 화요일 입니다   ";
		System.out.println(str.trim());
		
		// 대소문자 변경 toUpperCase(), to LowerCase();
		
		// 10. 문자열의 나열순서 비교 .compareTo
		// 아스키보드를 비교 음수가 나왔다면 앞에 있는 단어가 사전적으로 더 빠르다
		System.out.println("홍길동".compareTo("홍길동")); //출력 : 0,  같으면 0 반
		System.out.println("홍길동".compareTo("홍길자")); //출력 : -5047 다르면 음수 반환
	
		//11.문자열을 구분자로 연결, join() -스플릿의 반대
		String q = String.join("-","hello","world","join","만세" );
		System.out.println(q); // 출력 : hello-woerld-join-만세
	
	}

}
