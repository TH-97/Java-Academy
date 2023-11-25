package quiz12;

public class Wizard extends Player {
 	//Player클래스로 상속관계를 만들어 주세요
	//마법사는 생성될 때 ★이름만 매개변수로 받고, hp = 50, mp = 100이 됩니다.
	//마법사는 강력한 iceArrow()를 가지고 있습니다
	//iceArrow()는 호출될떄마다 mp를 -20씩 감소시킵니다
	
	//1, 생성자가 정상적으로 연결될 수 있도록 부모클래스와 연결
	
	Player[] arr = new Player[3];
	public Wizard(String name){
		super(name);
		this.hp= 1000;
		this.mp = 500;
	}
	
	//
	public void iceAroww(Player p){
		System.out.println("아이스에로우 사용");
		this.mp -= 20;  //나의 mp 에  - mp 20
		
		p.hp -= 100;
	}
	/*
	 *  blizzard(Player[] arr ) 메서드 광역스
	 *  
	 *  player[]에 있는 대상의 hp를 1~ 10씩 랜검하게 깍아주면 됩니다.
	 */
	
	public void blizzard(Player[] arr ) {
		for(Player p: arr) {
			int ran = (int)(Math.random() * 10) + 1;
			 p.hp -= ran;
			 
			 System.out.println(p.name + "님이 " + ran + "피해를 받았습니");
		}
	}
}
