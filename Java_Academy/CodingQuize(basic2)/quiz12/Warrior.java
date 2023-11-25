package quiz12;

public class Warrior extends Player {
	//Player클래스로 상속관계를 만들어 주세요
	//전사는 생성될 때 ★이름만 매개변수로 받고, hp = 100, mp = 50이 됩니다.
	//전사는 강력한 bash()를 가지고 있습니다
	//bash()는 호출될떄마다 mp를 -10씩 감소시킵니다
	
	
	//1. 생성자가 정상적으로 연결 될수 있도록 부모 클래스와 연결
	
	public Warrior(String name){
		super(name);
		this.hp = 1000; 
		this.mp = 1000; 
	}
	/*
	 * 1.bash는 매개변수로 전사 or 마법사가 대상이 됩니다.
	 * 
	 * 2.bash스킬 사용하면 나의 mp가 -100씩 소보가 됩니다.
	 * 
	 * 3. 나의 mp가 100이하면 스킬을 사용할 수 없다
	 * 
	 * 4. 대상이 전사라면 상대방의 hp를 -100감소시킴
	 * 	  대상이 마법사라면 상대방의 hp를 -200감소시킴
	 * 
	 */
	void bash(Player p){
		if(this.mp < 100) {
			System.out.println("스킬을 사용 할 수 없습니다");
			return;
		}else if(this.mp >100) {
			if(p instanceof Warrior) {
				this.mp -= 100;
				p.hp -= 100;
			}if(p instanceof Wizard) {
				p.hp -= 200;
			}
		
		}
	}
	
}
