package test;

import java.util.ArrayList;
import java.util.Arrays;

public class ProList4 {
	public static void main(String[] args) {
		int[] arr = {1,4,2,5,3}; //배열arr
		int siz = 0;
		ArrayList<String> stk = new ArrayList<>(siz);
		
		for(int i = 0; i < arr.length;i++) {
			
			if(siz == 0) {
				stk.add(String.valueOf(arr[i])); //stk.추가(스트링.벨류				
			} else if(siz != 0 && Integer.parseInt(stk) < arr[i]) {
				stk.add(String.valueOf(arr[i]));
			} else if(siz != 0 && stk[i] >= arr[i]) {
				stk.remove(String.valueOf(arr[i]));
			}
		}System.out.println(stk);
	}

}
