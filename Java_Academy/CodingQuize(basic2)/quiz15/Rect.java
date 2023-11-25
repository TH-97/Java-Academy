package quiz15;

public class Rect extends Shape {
	/*
	 * 1사각형은 생성될 때 도형이름과 반지름을 받아서 초기화
	 * 2. getArea()는 사격형의 넓이 반환
	 */

	private int side;	 //반지름

	public Rect(String name,int side) {
		super(name);
		this.side = side;
	}
	public double getArea() {
		return side * side;
	}
}
