package day09.inter.basic3;

public class MainClass {
	public static void main(String[] args) {
		
		Printed p = new Samsung();
		
		p.turnOn();
		p.print("hello world");
		p.colorPrint(345, "hello world");
		p.copy(5);
		p.turnOff();
	}

}
