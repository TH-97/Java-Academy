package api.lang.sbbuffer;

public class sbBufferEx {
	public static void main(String[] args) {
		//buffer, builder는 기능은 동일 합니다.
		//buffer는 쓰레드 환경에서 동기화 기능 제공, builder는 싱글 스레드에서만 사용하는게 좋습니다.
		StringBuffer sb = new StringBuffer("Java");
		//StringBuffer sb2 = new StringBuilder("Java");
		
		String s = new String("Jaba");
		
		//문자열의 덧셈
		
		s = s + " program";//새로운 객체가 생성됨
		sb.append(" program"); // 원본 sb가 변함
		
		System.out.println(sb);
		System.out.println(s);
		
		//중간에 추가  insert
		sb.insert(5, "support");
		
		//문자열 변경
		sb.replace(5, 12, "hello");
		
		//문자열 삭제 delete
		sb.delete(5, 11);
		//문자열 거꾸로
		sb.reverse();
		
		//String으로 타입 변경
		sb.toString();
	}

}
