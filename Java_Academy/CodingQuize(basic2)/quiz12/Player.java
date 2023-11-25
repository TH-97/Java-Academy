package quiz12;

public class Player {
	
	//private 는 상속이 되지않는다
	public String name;
	public int hp;
	public int mp;
	

	public Player(String name){
		this.name = name;
		this.hp = 100;
		this.mp = 100;
	}
	
	public void info() {
		System.out.println("케릭명:" + name);
		System.out.println("hp:" + hp);
		System.out.println("mp:" + mp);
	}
	
}
