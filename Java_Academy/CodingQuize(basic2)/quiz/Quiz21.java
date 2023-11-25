package quiz;

public class Quiz21 {
	public static void main(String[] args) {
		
		//이 배열에서 가장 큰 값을 출력해주세요.
		int[] arr = {34,65,12,34,56,34,100,54,21};
		int total = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(total < arr[i]) {
				total = arr[i];
			}
		}System.out.println(total);
	}

}
