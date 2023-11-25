package test;

import java.util.Scanner;

public class Test25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총가격:");
		int total = sc.nextInt(); //총 가격
		System.out.print("물건의 개수:");
		int num = sc.nextInt();  //물건의 개수
		
	    int rel = 0; // 결과
	    int i = 1; //증가할  
	    while(i <= num) {
	    	System.out.print("가격");
	    	int a = sc.nextInt();
	    	System.out.print("개수");
	    	int b = sc.nextInt();
	    	rel = rel + (a * b);
	    	++i;
	    } 
	    if (total == rel) {
	    	System.out.println("Yes");
	    } else {
	    	System.out.println("No");	
	    }sc.close();
		
	}

}
