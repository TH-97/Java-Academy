package api.lang.sbbuffer;

public class WrapperBoxing {
	public static void main(String[] args) {
		
		int a = 100;
		double b = 3.14;
		char c = 'A';
		boolean d = false;
		
		//boxing = 기본타입을  -> 객체형으로 변환
		Integer v1 = new Integer(a);
		
		Double v2 = new Double(b);
		
		Character v3 = new Character(c);
		
		Boolean v4 = new Boolean(d);
		
		//오브젝트는 최상위 객체라 가능
		Object[] arr = {v1,v2,v3,v4};
		
		//unboxing = 객체형 = > 기본타입
		
		v1.intValue();
	}

}
