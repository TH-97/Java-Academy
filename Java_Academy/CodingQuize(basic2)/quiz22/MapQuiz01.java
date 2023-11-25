package quiz22;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class MapQuiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Map<String, String> map = new HashMap<>();
		
		map.put("aaa123", "1234");
		map.put("bbb123", "5678");
		map.put("ccc123", "0000");
		
		/*
		 * 1.아이디와 비밀번호를 입력받아서 맵에 있는 키인지 검사합니다.
		 * 2.아이디가 존재하면, 비밀번호와 검사해서, 비밀번호가 일치하면 "로그인성공" 처리
		 * 
		 * 3. 비밀번호 다르다면, " 비밀번호가 틀렸습니다" 출력하면 됩니다.
		 * 4. 만약 아이디가 맵에 입력된 키가 아니라면 " 없는 아이디 입니다" 출력
		 * 
		 * 5.로그인이 성공할 때까지 탈출 할 수 없음
		 */
		
		ex:while(true) {
		System.out.println("아이디>");
		String name = sc.next();
		System.out.println("비밀번호>");
		String password = sc.next();
		
		if(map.containsKey(name)) {
			if(map.get(name).contains(password)) {
				System.out.println("로그인 성공");	
				break ex;
			}else if(!map.get(name).contains(password)) {
				System.out.println("비밀번호가 틀렸습니다");
				
			}
		}else if(!map.containsKey(name)) {
			System.out.println("없는 아이디 입니다");
		}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
