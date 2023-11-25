package quiz6;

public class Parent {
	String father;
	String mother;
	
	Parent(String father, String mother){
		this.father = father;
		this.mother = mother;
	}
	void info()	{
		System.out.println("아부지" + father + ", 어무니:" + mother);
	}

}
