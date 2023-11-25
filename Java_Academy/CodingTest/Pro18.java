package test;

//자릿수 더하기

//N	  answer
//123	6
//987	24
public class Pro18 {
	public static void main(String[] args) {
		int answer = 0;
		int N = 123;
		String N_str = String.valueOf(N);
		String[] N_spilt = N_str.split("");
		
		
		for(int i = 0; i < N_spilt.length;i++) {
			answer += Integer.parseInt(N_spilt[i]);
		}
		System.out.println(answer);
	}
}
/*
 * import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] array = String.valueOf(n).split("");
        for(String s : array){
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}

 */
