package day09.inter.basic2;

public class MainClass {
	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		Fish gold = new GoldFish();
		Fish shark = new Shark();
		
		// dog, cat, goldfish 는 IPet 타입이 될 수 있습니다.
		//ex) 강아지는 Animal타입이지만, 하위ㅡㄹ래스가 상호연관이 있다면 형변환이 가능합니다.
		
		IPet p1 = (IPet)dog;
		IPet p2 = (IPet)cat;
		IPet p3 = (IPet)gold;
		
		IPet[] arr = {p1,p2,p3};
		
		for(IPet p : arr) { //IPet p 는 객체 생성인가?
			p.play();
		}
		
		Animal a = (Animal)p1;
		Animal a1 = (Animal)p2;

	}

}
