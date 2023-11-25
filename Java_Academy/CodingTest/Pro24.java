package test;

import java.util.Arrays;

public class Pro24 {
	public static void main(String[] args) {
		String s = "3people unFollowed me";
		s = s.toLowerCase();
		//스플릿을 안쓰고 하려면 StringBuffer를 써야 한다고 생각했음
		StringBuffer s_buf = new StringBuffer();
		//처음에는 무조건 넣어줘야하니 넣어주고 반복할때 귀찮아서 밖으로 빼줌
		s_buf.append(Character.toUpperCase(s.charAt(0)));
		//append를 이용해 넣어보자
		for(int i =1; i < s.length();i++) {
			//char 타입이라 " " 가 아닌 ' '를 넣어줘야함
			//공백을 찾으면 공백을 넣어줌
			if(s.charAt(i)== ' ') s_buf.append(" ");
			//이 전에 공백이었다면 대문자로 바꾸고 값을 넣어줌
			else if(s.charAt(i - 1) == ' ') s_buf.append(Character.toUpperCase(s.charAt(i)));
			//나머지는 그냥 넣기
			else s_buf.append(s.charAt(i));
		}
		

//		for(int i = 0; i < s_split.length; i++) {
//			if((int)s_split[i].charAt(0) >96 &&(int)s_split[i].charAt(0) < 123 ) {
//				s_split[i] = s_split[i].substring(0,1).toUpperCase() + s_split[i].substring(1);
//				System.out.println(s_split[i]);
//			}
//		}
//		String answer = "";
//		for(int i = 0; i < s_split.length; i++) {
//			if(i == 0) {
//				answer = answer + s_split[i];
//			}else {
//				answer = answer + " " + s_split[i];
//			}
//		}

	
	}

}
