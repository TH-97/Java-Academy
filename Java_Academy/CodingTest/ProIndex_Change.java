package test;

public class ProIndex_Change {
	public static void main(String[] args) {
		
		String answer = "";
		String my_string = "hello";
		int num1 = 1;
		int num2 = 2;
		// split으로 쪼개기
		String[] my_string_split = my_string.split("");
		// 인덱스 바꾸기
		String temp = "";
		temp = my_string_split[num1];
		my_string_split[num1] =   my_string_split[num2];
		my_string_split[num2] = temp;
		
		for(int i = 0; i < my_string_split.length;i++) {
			// concat 문자열을 합쳐주는 함수
			answer = (answer.concat(my_string_split[i]));
		}

	}
}
