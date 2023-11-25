package day09.inter.basic2;

public class PetShop {
	
	//각각의 펫들을 저장할 수 있는 클래스
	
	/*
	 * 1. static carePet()
	 * 매개변수는 펫타입을 받아서 원본 타입으로 캐스팅 하는 기능
	 */
	
	public static void carePet(IPet pet){
		if(pet instanceof Dog) {
			Dog dog = (Dog)pet;
		}
		if(pet instanceof Cat) {
			Cat cat = (Cat)pet;
		}
		if(pet instanceof GoldFish) {
			GoldFish gold = (GoldFish)pet;
		}
	}
	
	//2.static petInfo()
	//매개변수로 펫 배열 타입을 받아서 play() 기능을 출력
	
	public static void petInfo(IPet[] pet) {
		
		for(IPet p  :pet) {
			p.play();
		}
		
	}

}
