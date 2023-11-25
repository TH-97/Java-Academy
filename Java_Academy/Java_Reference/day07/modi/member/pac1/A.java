package day07.modi.member.pac1;

public class A {
	
	//생성자에 접근제어자
	public A(int i) {}
	
	A(boolean b) {}
	
	private A(String s) {}
	
	/////////////////////////////////////////////
	public int var1;
	int var2;
	private int var3;
	
	public void method1() {}
	 void method2() {}
	private void method3() {}
	
	public A() {
		this.var1 = 1;
		this.var2 = 2;
		this.var3 = 3;
		
		method1();
		method2();
		method3();
	}

}
