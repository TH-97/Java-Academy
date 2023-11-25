package day05;

public class PhoneMain {
	public static void main(String[] args) {
		//객체는 5개이다
		Phone red = new Phone();
		red.info();
		
		Phone black = new Phone("black");
		black.info();
		
		Phone blue = new Phone("블루", 100000);
		blue.info();
		
		Phone white = new Phone(50000, "화이트");
		white.info();
		
		Phone yellow = new Phone("iphone 15 pro", 1500000, "노랑");
		yellow.info();
		
	}

}
