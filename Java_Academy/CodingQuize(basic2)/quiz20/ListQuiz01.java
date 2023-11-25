package quiz20;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz01 {
	public static void main(String[] args) {
		
		/*
		 *  1~20까지 리스트에 저장하기
		 *  
		 *  User 클래스를 저장하는 리스트를 생성하기
		 *  User클래스 - name,age를 은닉변수로 선언,생성자,getset
		 *  
		 *  객체를 2개 생성해서 list에 추가하기
		 *  이 리스트에 홍길동이 있다면 홍길동의 이름과 나이를 출력
		 *  이 리스트에 홍길자가 있다면 객체를 삭제
		 */
		
		ArrayList<Integer> list = new  ArrayList<>();
		for(int i = 1; i <= 20;i++) {
			list.add(i);
		}
		System.out.println(list.toString());
		
		User user1 = new User("홍길동", 20);
		User user2 = new User("홍길자", 30);
		List<User> list2 = new ArrayList<>();
		
		list2.add(user1);
		list2.add(user2);
		for(int i= 0; i < list.size(); i++) {
			User u = list2.get(i);
			String name = u.getName();
			if(name.contains("홍길동")) {
				System.out.println(u.getName() + u.getAge());
			}
			if(list2.get(i).getName().equals("홍길자")) list2.remove(i);//인덱스 번호로 삭제
		}
		System.out.println(list2.toString());
	}

}
