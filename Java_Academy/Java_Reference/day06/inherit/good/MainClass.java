package day06.inherit.good;

public class MainClass {
	public static void main(String[] args) {
		
		Person p = new Person();
		p.name = "홍길동";
		p.age = 20;
		System.out.println(p.info());
		
		Student s = new Student();
		s.name = "이순신";
		s.age = 30;
		s.student_Id = "12345";
		System.out.println(s.info());
		
		Teacher t = new Teacher();
		t.name = "피카츄";
		t.age = 40;
		t.subjext = "언제언제까지나";
		System.out.println(t.info());
	}

}
