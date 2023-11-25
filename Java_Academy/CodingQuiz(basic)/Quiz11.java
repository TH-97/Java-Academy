package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		
		// 수를 입력하세요>10
		//[1,2,3,4,5,6,7,8,9,10]
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요>");
		int a = sc.nextInt(); //받아올 값
		int[] arr = new int [a];
		
		int i = 0;//증가할 값
		System.out.println(); //한칸 띄어쓰기
		while(i < arr.length ) {

			arr[i] = i + 1;
			i++;
		}System.out.print(Arrays.toString(arr)); // 배열 출력하기 **
		sc.close();
	}

}