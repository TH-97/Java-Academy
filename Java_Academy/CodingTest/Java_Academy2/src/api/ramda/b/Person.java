package api.ramda.b;

public class Person {

	public void greeting(Say01 say) {
		say.talking();
	}
	
	//say02를 받는 인사법
	public String greeting(Say02 say) {
		String result = say.talking();
		return result;
	}
	public int greeting(Say03 say){
		int result = say.talking("hello",10);
		return result;
	}

}
