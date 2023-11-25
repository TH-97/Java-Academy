package api.lang.sbbuffer;

public class MathEx {
	public static void main(String[] args) {
		//Math math = new Math() 가 안되는 이유는 private이기 때문
		//Math는 전부 static 메서드 입니다.
		
		//절대값
		Math.abs(-1);
		
		//올림
		Math.ceil(0);
		//내림
		Math.floor(0);
		
		//반올림
		Math.round(0);
		
		//큰수
		Math.max(3,4);
		
		//작은수
		Math.min(3,4);
		//루트값
		Math.sqrt(0);
		//제곱
		Math.pow(2, 3);
		
	}

}
