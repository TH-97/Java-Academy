package quiz23;

public class Data {
	String name;
	String age;
	String e_mail;
	String area;

	Data(){
	}
	public Data(String name, String age, String e_mail, String area) {
		this.name = name;
		this.age = age;
		this.e_mail = e_mail;
		this.area = area;
	}
	public void info() {
		System.out.println("이름: "+ name );
		System.out.println("나이: "+ age );
		System.out.println("이메일: "+ e_mail);
		System.out.println("지역: "+ area );
	}
}
