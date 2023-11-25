package day03;

import java.util.Scanner;

public class ArrayUpdate {
	public static void main(String[] args) {
		//배열에서 값을 찾고 수정한다
		
		String[] arr = {"홍길동", "이순신", "피카츄", "라이츄", "꼬북이"};
		
		//어떤값을 받아서 그 값이 있다면 수정, 없다면 넘어감
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 값 입력>");
		String name = sc.next();
		//입력한 값을 찾는다. (문자열은 ==이 아니라 ??.eqauls() )
		boolean bool = false; //값을 찾았는지 여부 확인하기 위한변수
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(name)) {
				System.out.print(arr[i] + "님을 수정할게요");
				System.out.print("수정 값 입력>");
				arr[i] = sc.next();
				bool = true; //찾음
//				String a = sc.next();
//				arr[i] = a;
				break;
			}
		}
		
		//결과 출력
		if(bool) {
			System.out.println("수정이 완료 되었습니다");
		}else {
			System.out.println("찾는 값은 없습니다.");
		}sc.close();
	}

}
