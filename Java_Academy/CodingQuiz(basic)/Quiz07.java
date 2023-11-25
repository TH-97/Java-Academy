package quiz01;


public class Quiz07 {
	public static void main(String[] args) {
		
		String[] arr = {"안녕하세요","hello","니하오","$%^"};
		
		//math.random() 으로 랜덤하게 인덱스가 선택되게 인덱스 번호를 생성합니다.
		// 선택된단어 : 안녕하세요
		// 한국어 입니다.
		
		int i = (int)(Math.random()*4); // int i = (int)(Math.random() * arr.length);
		System.out.println("선택된 단어:"+ arr[i]);
		switch (i) { // swith(arr[d])
		case 0:  // case "안녕하세요"
			System.out.println("한국어 입니다.");
			break;
		case 1:
			System.out.println("한국어 입니다.");
			break;
		case 2:
			System.out.println("중국어 입니다.");
			break;
		case 3:
			System.out.println("언어가 아닙니다.");	
			break;
			}
		}
}	

