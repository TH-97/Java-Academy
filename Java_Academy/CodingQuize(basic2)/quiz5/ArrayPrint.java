package quiz5;

public class ArrayPrint {
	/*
	 * Arrays.toString() 의 기능을 따라하기
	1. toArray() - int[]을 매개변수로 입력받아 배열의 모형을 문자열로 리턴하는 메서드
	2. toArray() - 1번과 내용은 같고, char[]을 받도록 overloading
	2. toArray() - 1번과 내용은 같고, String[]을 받도록 overloading
	 */
	
	String toArray(int[] a) {
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
	String[] toArray(char[] a) {
		return null;
	}
	String[] toArray(String[] a) {
		return null;
	}

}
