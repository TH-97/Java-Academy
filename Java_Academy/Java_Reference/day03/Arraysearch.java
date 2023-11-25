package day03;

import java.util.Scanner;

public class Arraysearch {
	public static void main(String[] args) {
		//탐색 (순회)
		
		int[] arr = {54,23,12,76,56,45,1,2,3};
		//입력받은 값이 배열에 있는가?
		
		Scanner sc = new Scanner(System.in);
		System.err.print("찾을값>");
		int search = sc.nextInt();
		
		boolean bool = false; //찾았다? 못찾았?
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] == search) {
				System.err.println(search + "는"+ i + "번째 인덱스 있습니다");
				bool = true; //bool true 라는 것은 if문을 실행했다는 의
				break;
			}
		}sc.close();
		//반대
		for(int i = arr.length-1; i > -1; i--) {
			if(arr[i] == search) {
				System.out.println(search);
				bool =true; //bool true 라는 것은 if문을 실행했다
				break;
			}
			
		}
		
		if (bool == false) {
			System.out.println(search + "는 없습니다");
		}
	}

}
