package quiz10;

public class User {
	
	private String name;
	private int rrn;
	private int age;
	
	//생성자 , 케터 , 세터 생성하면 됩니다
	
	User(){
	}
	
	User(String name,int rrn, int age) {
		this.name = name;
		this.rrn = rrn;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRrn() {
		return rrn;
	}
	public void setRrn(int rrn) {
		this.rrn = rrn;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
