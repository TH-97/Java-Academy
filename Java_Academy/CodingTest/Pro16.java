package test;
//나머지가 1이 되는 수 찾기
/*
 * 연수 n이 매개변수로 주어집니다.
 *  n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
 *   답이 항상 존재함은 증명될 수 있습니다.
 *  n	result
	10	3
	12	11
 */
public class Pro16 {
	public static void main(String[] args) {
		int result = 0;
		int n = 10;
		
		for(int i = 1; i <= n;i++ ) {
			if(n % i == 1) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}

}
/* 내가 생각해내지 못한 코드 while을 생각하자
 * class Solution {
    public int solution(int n) {
        int answer = 1;

        while(true) {
            if (n%answer==1) break;
            answer++;
        }

        return answer;
    }
}

*/