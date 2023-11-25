package day02;

public class ForEx02 {
	public static void main(String[] args) {
		
		//랜덤한 정수가 소수인지 판별 
		// 소수 = 약수가 1과 자기자신인 
		
		/*
		 * 1.ran수까지 회전을 한다.
		 * 2.약수의 개수를 센다.
		 * 3. for문 밖에서 개수확인한다.
		 */
		
		int ran = (int)(Math.random()*100) + 1; // 1~100
		int count = 0; // 갸수를 셀 변
		System.out.println("랜덤수:" + ran);
		for(int i = 1; i <= ran;i++ ) {
			
			if(ran % i == 0) { //약수의 의미
				count++; // 약수의 개수를 체
			}
			
		}
		System.out.println( count == 2? "소수 입니다":"소수가 아닙니다");
		
		
	}

	
}
