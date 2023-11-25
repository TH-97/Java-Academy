package quiz17;

public class BugsMusic implements SongList {
	
	private String[] list = new String[100];
	private int count = 0;
	
	/* SongList인터페이스를 상속받습니다.
	 * 마음대로 작성.
	 * 
	 */
	@Override
	public void insertList(String song) {
		list[count] = song;
	}
	@Override
	public void playList() {
		System.out.println(list[(int)((Math.random()*count)+1)]);
	}
	@Override
	public int playLength() {
		return count;
	}
	
	
}
