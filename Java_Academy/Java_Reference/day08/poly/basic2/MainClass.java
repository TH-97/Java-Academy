package day08.poly.basic2;

public class MainClass {
	public static void main(String[] args) {
		
//		Student s1 = new Student("홍길동",20,"123123");
//		Student s2 = new Student("홍길자",30,"464456");
//		Student s3 = new Student("이순신",40,"555555");
//		
//		Teacher t1 = new Teacher("피카츄",20,"언제언제 까지나");
//		Teacher t2 = new Teacher("라이츄",30,"진실한 마음으로");
//		
//		Employee e1 = new Employee("손흥민", 40 , "111");
//		
		// 앞의 클래스 타입이 달라서 한번에 담을수가 없다
//		Student[] arr = {s1,s2,s3};
//		Teacher[] arr2 = {t1,t2};
//		Employee[] arr3 = {e1};
//		
//		for(Student i : arr) {
//			System.out.println(i); //이렇게 하면 주소값만 나온다
//			System.out.println(i.info());
//		}
		Person s1 = new Student("홍길동",20,"123123"); // 자식 클래스 타입이 부모 클래스의 타입을 가질수 있다
		Person s2 = new Student("홍길자",30,"464456");
		Person s3 = new Student("이순신",40,"555555");
		
		Person t1 = new Teacher("피카츄",20,"언제언제 까지나");
		Person t2 = new Teacher("라이츄",30,"진실한 마음으로");
		
		Person e1 = new Employee("손흥민", 40 , "111");
		
		Person[]  arr = {s1,s2,s3,t1,t2,e1};
		
		for(Person i:arr) {
			System.out.println(i.info());
		}
		//
		System.out.println("---");
		House house = new House();
		
		house.printPerson(s1); // 값 출력하기
			
		house.printPerson(arr); // 값 출력하기
		
		house.addPerson(s1); // 값 넣기
		
		System.out.println("-----");
		
//		MainClass m = new MainClass(); 
//		m.personInfo(e1);
			
		personInfo(e1); //이 객체가
	}

	//instanceOf확인
	public static void personInfo(Person p) { // 여기
		
		if(p instanceof Student) {
			Student s = (Student)p;
			System.out.println(s.info());
		}else if(p instanceof Employee) {
			Employee e = (Employee)p;
			System.out.println(e.info());
		}else if(p instanceof Teacher) {
			Teacher t = (Teacher)p;
			System.out.println(t.info());
		}else if(p instanceof Person) {
			System.out.println("person입니다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
