package test;


//x만큼 간격이 있는 n개의 숫자

/*
 *  x	n	answer
	2	5	[2,4,6,8,10]
	4	3	[4,8,12]
	-4	2	[-4, -8]
 */
public class Pro15 {
	public static void main(String[] args) {
		int x = -4;
		int n = 2;
		long[] answer = new long[n];
		
		for(int i = 0; i < n; i ++ ) {
			answer[i] =  (long) x * (i + 1);  //(long)을 넣어주지 않으면 반례가 생긴다
		}
		
	}

}
