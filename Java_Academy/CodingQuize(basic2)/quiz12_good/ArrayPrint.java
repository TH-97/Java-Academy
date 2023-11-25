package quiz12_good;

public class ArrayPrint {
	/*
	 * Arrays.toString() 의 기능을 따라하기
	1. toArray() - int[]을 매개변수로 입력받아 배열의 모형을 문자열로 리턴하는 메서드
	2. toArray() - 1번과 내용은 같고, char[]을 받도록 overloading
	2. toArray() - 1번과 내용은 같고, String[]을 받도록 overloading
	 */
	
	/*
	 * 1. 생성자에 접은제어자를 붙여서, 객체 생성이 불가능하도록 처리
	 * 
	 * 2. 메서드 호출시에는 static키워드를 붙여서 사용하도록 변경
	 */
	
	private ArrayPrint() {}
	
	public static String toArray(int[] a) {
		String str_b = "";
		for(int i = 0; i < a.length;i++) {
			str_b += a[i] +","; 
			if( i == a.length-1) {
				str_b += a + "";
			}
		}
		str_b = "[" + str_b + "]";
		return str_b;
	}
	public static String[] toArray(char[] a) {
		return null;
	}
	public static String[] toArray(String[] a) {
		return null;
	}

}
