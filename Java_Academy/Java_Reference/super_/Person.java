package super_;

public class Person {
	
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name; //나의 멤버변수.name = 값을 받아온 name
		this.age = age;
		
		System.out.println("나는" + this + "입니다");
	}
	
	Person(String name){
//		this.name = name; //나의 멤버변수.name = 값을 받아온 name
//		this.age = 1;
		this(name,1);
	}
	
	Person(){
//		this.name = "이름미정";
//		this.age = 1;
		this("이름미정", 1);
	}
	
	String info() {
		return "이름:" + name +", 나이" + age;
	}

}
