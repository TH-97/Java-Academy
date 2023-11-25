package quiz16;

public class DropShip extends Unit {
	
	/*
	 * 유닛을 담을 배열
	 */
	
	private Unit[] arr = new Unit[8];
	private int index = 0; // 배열을 다룰 인덱스

	public DropShip() {
		super(0, 0, 150);
	}
	public void location() {
		System.out.println("수송선의:" + getX() + " " + getY()); 
	}
	
	public void move(int x, int y) {
		//수송선이 이동하면
		//수송선 x, y 위치로 모든 유닛의 위치를 변경
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] != null) {
			arr[i].setX(x);
			arr[i].setY(y);
			}
		}
	}
	public Unit[] getArr() {
		return arr;
	}
	public void setArr(Unit[] arr) {
		this.arr = arr;
	}
	//2.유닛 탑승 기능
	/*
	 * void ride(Unit unit)
	 * 1.모든 유닛타입을 매개변수로 받을수 있음
	 * 유닛을 배열에 저장
	 * 탱크는 배열의 크기를 4칸씩 사용
	 * 마린은 배열의 크기를 1칸씩 사용
	 * 
	 * 배열이 전부 차거나, 해당유닛이 탈수 있는 공간이 없으면
	 * "수송선에 공간이 부족합니다.
	 * 수송선에 탑승한 유닛을 가로로 출력
	 * main에서 확인하기
	 */
	public void ride(Unit unit) {
		if(unit instanceof Marine) {
			if(index+1 <= 8) {
				arr[index] = unit;
				index++;
			}else{
				System.out.println("수송선에 공간이 부족합니다");
			}
		}else if(unit instanceof Tank) {
			if(index+4 <= 4) {
				arr[index] = unit;
				index=+4;
			}else {
				System.out.println("수송선에 공간이 부족합니다");
			}
		}
	}
//	public void ride(Unit unit) {
//		if(unit instanceof Marine && index <= 7) {
//			arr[index] = unit;
//			index++;
//		}
//	}
	//탑승 유닛을 가로로 출력
//	for(int i = 0; i < arr.length;i++) {
//		if(arr[i] instanceof Marine) {
//			System.out.println("마린");
//		}else if(arr[i] instanceof Tank) {
//			System.out.println("땡크");
//		}
//	}

}
