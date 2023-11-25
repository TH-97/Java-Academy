package day09.abs.good;

public class SeoulStore extends Store {

	@Override
	public void apple() {
		System.out.println("서울의 사과는 500원");
		
	}

	@Override
	public void melon() {
		System.out.println("서울의 멜론은 600");
		
	}

	@Override
	public void orange() {
		System.out.println("서울의 오랜기는 700");
	}
	
	
}
