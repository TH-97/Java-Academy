package quiz16;

public class Tank extends Unit {
	
	private static int changeMode = 0;

	public Tank() {
		super(0,0,150);
	}

	public void location() {
		System.out.println("현재위치:" + getX() + " " + getY()); 
	}
	
	public void move(int x, int y) {
		setX(x);
		setY(y);
		
	}
	public void changeMode() {
		System.out.println("모드를 변경합니다");
		if(changeMode == 0) {
			System.out.println("공격모드로 변경합니다");
			changeMode = 1;
		}else if(changeMode == 1) {
			System.out.println("수비모드로 변경합니다");
			changeMode = 0;
			
		}
	}

	public int getChangeMode() {
		return changeMode;
	}

	public void setChangeMode(int changeMode) {
		Tank.changeMode = changeMode;
	}

}
