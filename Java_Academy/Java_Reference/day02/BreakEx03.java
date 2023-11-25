package day02;

public class BreakEx03 {
	public static void main(String[] args) {
		
		//이름붙여 탈출하기(중첩반복문 에서)
		
		boolean bool = false; //false 라면 실행을 안함, true라면 실행 했
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.println(i+"-"+j);
				if(j == 5) {
					bool = true;
					break;
				}
			}
			if(bool) break; //if bool 이 true 면 탈출
		}
		
		
		escape:for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.println(i + "-" + j);
				if(j == 5) {
					break escape;
				}
			}
		}
	}

}
