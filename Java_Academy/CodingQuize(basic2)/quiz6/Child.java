package quiz6;

public class Child extends Parent {
	
	String child;

	Child(String father, String mother,String child) {
		super(father, mother);
		this.child = child;
	}
    void info() {
		super.info();
	}

}
