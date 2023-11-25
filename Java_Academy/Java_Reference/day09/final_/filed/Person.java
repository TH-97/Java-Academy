package day09.final_.filed;

public class Person {
	//final이 변수에 붙는경우 (변경금지)
	//final 변수는 반드시 초기화가 진행되어야 합니다
	public final String nation = "대한민국";
	public final String ssn;
	public String name; // 이름
	
	public Person (String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

}
