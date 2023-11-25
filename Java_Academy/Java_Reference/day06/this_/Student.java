package day06.this_;

public class Student extends Person {
	String student_Id; //학번
	//name , age
	
	//생성자
	Student(String name, int age, String student_Id){
		this.name = name;
		this.age = age;
		this.student_Id = student_Id;
	}

}
