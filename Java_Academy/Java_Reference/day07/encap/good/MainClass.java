package day07.encap.good;

public class MainClass {
	public static void main(String[] args) {
		MyBirth me = new MyBirth(11,2022,"123456-1123445");
		
		
		//값의 저장
		me.setSsn("123456-1123445");
		
		me.setYear(2022);
		me.setMonth(11);
		
		//값의 사용
		int year = me.getYear();
		
		System.out.println(me.getMonth());
		System.out.println(me.getSsn());
		System.out.println(year);
	}

}
