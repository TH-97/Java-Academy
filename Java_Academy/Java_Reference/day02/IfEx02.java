package day02;

import java.util.*;
public class IfEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수입력>");
		int point = sc.nextInt();
		
		
		// A,B,C,D,F
		
/*		if(point >= 90) {
			System.out.println("A학점 입니다.");
		} else if(point >80) {
			System.out.println("B학점 입니다.");			
		}else if(point >70) {
			System.out.println("C학점 입니다.");
		}else if(point >60) {
			System.out.println("D학점 입니다.");
		}else {
			System.out.println("F학점 입니다.");
			
		}*/
		String grade;
		
		if(point >= 90) {
			grade = "A학";
		} else if(point >80) {
			grade = "B학";
		}else if(point >70) {
			grade = "C학";
		}else if(point >60) {
			grade = "D학";
		}else {
			grade = "F학";
		}
		
		System.out.println(grade);
		sc.close();
	}
}
