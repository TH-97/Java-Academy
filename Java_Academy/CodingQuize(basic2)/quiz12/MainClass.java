package quiz12;

public class MainClass {
	public static void main(String[] args) {
		
		//나의 캐릭터
		Warrior me = new Warrior("나");
		//상대방 캐릭터
		Warrior you = new Warrior("너");
		Wizard you2 = new Wizard("너2");
		
		me.bash(you);
		
		Player[] arr = {me, you};
		
	}

}

