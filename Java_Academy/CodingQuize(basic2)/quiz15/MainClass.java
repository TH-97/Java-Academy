package quiz15;

public class MainClass {
	public static void main(String[] args) {
		
		Shape shape = new Circle("원",5);
		System.out.println(shape.getArea());
		Shape shape2  = new Rect("사각형",5);
		System.out.println(shape2.getArea());
	}

}
