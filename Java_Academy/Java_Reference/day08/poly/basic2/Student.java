package day08.poly.basic2;

public class Student extends Person {
	String student_Id; //학번
	//name , age
	
	//생성자
	Student(String name, int age, String student_Id){
//		this.name = name;
//		this.age = age;
		super(name,age);
		this.student_Id = student_Id; //Student에만 존재하는 멤버변수라서
	}
	String info() {
		return super.info()	+ ", 학번:" + student_Id;
		//Person 에 있는 info()를 가져온다
	}

}
