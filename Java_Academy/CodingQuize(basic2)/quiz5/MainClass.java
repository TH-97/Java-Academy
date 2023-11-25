package quiz5;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		ArrayPrint ap = new ArrayPrint();
		int[] Array = {1,2,3,4};
		ap.toArray(Array);
		System.out.println(Arrays.toString(Array));
	}

}

