package super_;

public class Teacher extends Person {

	String subjext;
	
	Teacher(String name, int age, String subject, String subjext){
		super(name, age);
		this.subjext = subjext;
	}

}
