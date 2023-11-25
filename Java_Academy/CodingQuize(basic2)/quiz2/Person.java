package quiz2;

public class Person {
	//홍길동
	//20세
	//키: 180
	String name;
	int age;
	int height;
	
	Person(){
	}
	
	Person(String name_1,int age_1,int height_1){
		name = name_1;
		age = age_1;
		height = height_1;
	}
	void info() {
		System.out.println("==개인정보==");
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("키:" + height);
	}

}
