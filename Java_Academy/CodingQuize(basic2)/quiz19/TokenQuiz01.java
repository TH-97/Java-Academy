package quiz19;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenQuiz01 {
	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너 next.Line()를 이용하여 공백을 포함한 문장을 입력 받습니다.
		 * 2. , 와 공백 기준으로 문장을 분리 합니다.
		 * 3. 분리된 토큰에 숫자를 붙여서 세로로 출력
		 * 4. 분리된 토큰을 배열에 담아주세요.
		 * 5. 반복문 한번만 돌리기
		 * 
		 * 예)
		 * 안녕, 하세요? 오늘은 ㅋㅋㅋ
		 * 1.안녕
		 * 2.하세요?
		 * 3.오늘은
		 * 4.ㅋㅋㅋ
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("문장>");
		String log = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(log, ", ");
		
		String[] arr = new String[st.countTokens()];
		
		for(int i = 0; st.hasMoreTokens();i++) {
			String x = st.nextToken();
			arr[i] = x;
			System.out.println(i+1+". " + x);
		}
		System.out.println(Arrays.toString(arr));
	
		
	}

}
