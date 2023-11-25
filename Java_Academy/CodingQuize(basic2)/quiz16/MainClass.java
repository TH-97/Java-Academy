package quiz16;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		Unit marine1 = new Marine();
		
		Unit marine2 = new Marine();
		Unit marine3 = new Marine();
		Unit marine4 = new Marine();
		Unit marine5 = new Marine();
		Unit tank1 = new Tank();
		Unit tank2 = new Tank();
		DropShip dropship1 = new DropShip();
		
		System.out.println(marine1.getHp());
		System.out.println(marine2.getHp());
		System.out.println(Marine.getAttack());
		
		Marine.upGradeMarine();
		System.out.println(Marine.getAttack());
		System.out.println(Marine.getArmor());

		dropship1.ride(marine1);
		dropship1.ride(marine2);
		dropship1.ride(marine3);
		dropship1.ride(marine4);
		dropship1.ride(tank1);
		dropship1.ride(tank2);
		

		System.out.println(Arrays.toString(dropship1.getArr()));
		
		dropship1.move(5, 5);
		
		System.out.println(marine1.getX());
		System.out.println(marine1.getY());
	
		
		
		
		
	}

}
