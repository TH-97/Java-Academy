package quiz;

import java.util.Scanner;

public class Quiz25 {
	public static void main(String[] args) {
		//배열의 size는 조정하지 마세요.
		String[] arr = new String[100]; //딱 100명만 수용가능
		
		int index = 0; // 위치값
		
		/*
		 * 먹고싶은 음식을 선택하세여
		 * 입력을 중지하려면 [그만]을 입력하세요
		 * >
		 * >
		 * >
		 * 입력종료
		 * --입력 받은 메뉴--
		 * 피자 햄버거 국밥
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("먹고싶은 음식을 선택하세요");
		System.out.println("입력을 중지하려면 [그만]을 입력하세요");
		int count = 0;
		for(int i = index; i <= arr.length; i++) {
			System.out.print(">");
			String food = sc.next();
			arr[i] = food;
			count++;
			if(food.equals("그만")) {
				break;
			}
		}System.out.println("---입력 받은 메뉴---");
		for(int i = 0;i < count - 1; i++) {
			System.out.print(arr[i] + " ");
		} sc.close();

	}
}
