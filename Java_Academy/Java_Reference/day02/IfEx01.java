package day02;

public class IfEx01 {
	public static void main(String[] args) {
		//1~100까지 랜덤한 정수를 하나 생성
		
		int point = (int)(Math.random() * 100) + 1;//1~100
		
		System.out.println("점수는:"+ point + "입니다.");
		
		//60점 합격 커트라인
		
		if( point >= 60) {
			
			System.out.println("축 합격입니다.");
		} else {
			System.out.println("불합격");
		}
	}

}
