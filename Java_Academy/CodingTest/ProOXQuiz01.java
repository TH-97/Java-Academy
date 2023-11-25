package test;

import java.util.Arrays;

public class ProOXQuiz01 {
	
	public static void main(String[] args) {
		
		String[] quiz = {"5 - 4 = 1","5 + 6 = 11"};
		
		String[] answer = new String[quiz.length];
		
		for(int i = 0; i < quiz.length; i++) {
			String[] quiz_copy = quiz[i].split(" ");
			System.out.println(Arrays.toString(quiz_copy));
			int x = Integer.parseInt(quiz_copy[0]);
			int y = Integer.parseInt(quiz_copy[2]);
			int z = Integer.parseInt(quiz_copy[4]);
			String a = quiz_copy[1];
			
			if(a.equals("-")) {
				if(x - y == z) {
					answer[i] = "O"; 
				}else if(x - y != z) {
					answer[i] = "X";
				}
			}	
			else if(a.equals("+")) {
				if(x + y == z) {
					answer[i] = "O";
				}else if(x + y != z) {
					answer[i] = "X";
				}
			}

		}System.out.println(Arrays.toString(answer));
		
	}

 
}
