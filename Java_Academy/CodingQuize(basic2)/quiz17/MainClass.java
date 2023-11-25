package quiz17;

public class MainClass {
	public static void main(String[] args) {
		MelonMusic so = new MelonMusic();
		
		so.insertList("이적 - 하늘을 달리다");
		so.insertList("이적 - 빨래");
		so.insertList("이적 - 달팽이");
		so.insertList("이적 - 그땐 미처 알지 못했지");
		so.insertList("이적 - 다행이다");
		
		so.playList();
		
		so.playLength();
	}

}
