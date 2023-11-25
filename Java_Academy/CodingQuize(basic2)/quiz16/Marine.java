package quiz16;

public class Marine extends Unit {
	
//	private static int hp = 60;
	private static int attack = 6;
	private static int armor = 0;
	//생성자
	public Marine() {
		super(0,0,40);
	}
	
	public static void upGradeMarine() {
		attack += 1;
		armor +=1;
	}
	
	public void location() {
		System.out.println("마린의 현재위치:" + getX() + " " + getY()); 
	}
	
	public void move(int x, int y) {
		setX(x);
		setY(y);
	}

	public static int getAttack() {
		return attack;
	}

	public static void setAttack(int attack) {
		Marine.attack = attack;
	}

	public static int getArmor() {
		return armor;
	}

	public static void setArmor(int armor) {
		Marine.armor = armor;
	}
	
	
	
}
