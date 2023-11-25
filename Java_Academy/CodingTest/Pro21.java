package test;
//콜라 문제
public class Pro21 {
	public static void main(String[] args) {
		int a = 3; // 최소로 가져가야 할 빈병
		int b = 1; //마트가 주는 콜라 갯수
		int n = 20; // 내가 가지고 있는 빈병
		int answer = 0; // 내가 받을 수있는 총 콜라

		while(true) {
			int bottle = 0;
			if((n + bottle) >= a) { 
				if((n + bottle) % a == 0) { // 가지고 있는 빈병 + 남은 빈병 % 최소로 가져야할 빈병 == 0;
					n = ((n + bottle) / a) * b;
					answer +=n;
					bottle = 0;
				}
			}
			
		}
		
	}
}
