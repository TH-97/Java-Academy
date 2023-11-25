package quiz20;


public class User implements Comparable<User> {
	private String name;
	private int age;
	
	User(){}
	
	public User(String name, int age){
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	//비교
	public int compareTo(User o) {
		return name.compareTo(o.getName());
	}
}
