package quiz11;

public class MainClass {
	public static void main(String[] args) {
		
		Computer com = new Computer();
		
		com.getKeyBoard().info();
		com.getMouse().info();
		com.getMonitor().info();
		
		KeyBoard key = new KeyBoard(); 
		Mouse mouse = new Mouse(); 
		Monitor moniter = new Monitor(); 
		
		Computer com2 = new Computer(new Monitor(),new  KeyBoard(),new Mouse()); 
		com2.getKeyBoard().info();
		
		com.setKeyBoard(new KeyBoard());
		
		com.ComputerInfo();// 컴퓨터 정보
		Monitor mo = com.getMonitor();
		mo.info();
		
		
	
		
	}	

}
