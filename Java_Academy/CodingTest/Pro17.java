package test;
//자연수를 뒤집어 배열로 만들기

import java.util.Arrays;

public class Pro17 {
	public static void main(String[] args) {
		long n = 12345;
		String nstr = String.valueOf(n);
		String[] num_split = nstr.split("");
		int[] answer = new int[num_split.length];
		int count = 0;
	
		for(int i = answer.length -1 ; i >= 0; i--) {
			answer[i] = Integer.parseInt(num_split[count]);
			count++;
		}
		System.out.println(Arrays.toString(answer));
	}
	

}
/*
 * import java.util.stream.IntStream;

class Solution {
    public int[] solution(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}
 */
