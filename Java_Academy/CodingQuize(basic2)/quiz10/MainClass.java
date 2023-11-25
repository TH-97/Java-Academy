package quiz10;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		/* 문제1
		 * 1. User 클래스에는 기본생성자, 모든 멤버변수를  초기화 하는 생성자  2개를 생성하세요.
		 * 2. main에서 User객체를  생성 후  
		 *    (홍길동, 123123, 20)을 저장 하고 값을 확인하세요.
		 */
		User user = new User("홍길동",123123,20);
		
//		user.setName("홍길동");
//		user.setRrn(123123);
//		user.setAge(20);
		
		user.getName();
		user.getRrn();
		user.getAge();
		System.out.println(user.getName()); //이렇게 해야 출력
		
				

		/* 문제2
		 * 1. 2개의 크기를 갖는 User배열을 선언하세요. (User배열은 User클래스를 저장할 수 있습니다.)
		 * 2. 두번째 User객체를 생성하세요. ("김길동", 456456, 30)을 저장.
		 * 3. User배열에 두 객체를 저장하세요.
 		 * 4. 향상된 포문을 사용해서  *모든변수*를 출력하세요.
 		 * ex) User[] arr = new User[2];
		 */
		User user_2 = new User("김길동",456456,30);

		User[] user_str = new User[2];
		user_str[0] = user;
		user_str[1] = user_2;
		
		for(User i :user_str) {
			System.out.printf(i.getName() + i.getAge() +  i.getRrn());
		}
		//위와 같은 문장
		for(int i = 0; i < user_str.length;i++) {
			User u = user_str[i]; 
			System.out.println(u.getName() + u.getAge() +  u.getRrn());
		}
		/* 문제 3
		 * 1. 5개의 크기를 갖는 User배열을 선언하세요.
		 * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
		 * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
		 * 4. while문 안에서 User객체를 User배열에 저장하세요.
		 * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 
		 */
		
		User[] user_str_2 = new User[5];
		int i =0;
		while(i<user_str_2.length) {
			Scanner sc = new Scanner(System.in);
			User user_input = new User(sc.next(),sc.nextInt(),sc.nextInt()); 
			user_str_2[i] = user_input;
			i++;
		}
		
		System.out.println(Arrays.toString(user_str_2));
	}


}
