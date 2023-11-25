package day04;

import java.util.Arrays;

public class MethodEx04 {
	public static void main(String[] args) {
		// 배열을 매개변수로 전수
		String[] arr1 = {"월", "화", "수"};
		
		//func01(배열)
		String result = func01(arr1);
		System.out.println(result);
		
		// 배열을 반환
		int[] result2 = func02();
		System.out.println(Arrays.toString(result2));
		
		//merhod6
		char[] char_arr= {'a','b','c'};
		System.out.println(method6(char_arr));
		//method7
		int[] num_arr_main = {1,2,3,4,5};
		System.out.println(method7(num_arr_main));
		//method8
		System.out.println(Arrays.toString(method8("안","녕")));
	}
	
	//배열을 매개변수로 받는다.
	static String func01(String[] arr) {
		
		String str = "";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
		}
		
		return str;
	}
	
	//배열을 반환하는 메서드
	static int[] func02() {
		int[] arr = {1,2,3};
		//내용 생략
		return arr;
	}
	
	static String method6(char[] ch) {
		String str = "";
		for(int i = 0; i < ch.length; i++) {
			str += ch[i];
		}
		return str;
	}

	static int method7(int[] num_arr) {
		int total =0;
		for(int i = 0; i < num_arr.length;i++) {
			total += num_arr[i];
		}
		return total;
	}

	static String[]	method8(String str1, String str2) {
		String[] str_arr = {str1,str2};
		return str_arr;
	}
}
