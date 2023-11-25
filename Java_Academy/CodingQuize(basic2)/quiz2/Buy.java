package quiz2;

import java.util.Scanner;

public class Buy {
	Scanner sc = new Scanner(System.in);
	
	String name;
	int count = 0;
	int password;
	int chargi;
	String[] buylist = {"냉장고", "컴퓨터"};
	int[] buymoney = {10000,1000};
	String[] mybuylist = new String[2];
	
	Buy(){	
	}
	Buy(String n, int p, int c){
		name = n;
		password = p;
		chargi = c;
	}
	
	void list() {
		System.out.println("==구매 가능==");
		System.out.println("냉장고");
		System.out.println("컴퓨터");
		System.out.println("===========");
	}
	
	void buying(String str){
		
		for(int i = 0; i < buylist.length; i++) {
			if(str == buylist[i]) {
				chargi = chargi - buymoney[i];
				mybuylist[count] = buylist[i];
				count++;
				break;
			}else {
				System.out.println("구매 목록이 없습니다.");
			}
		}
	}
	void refund(String str){
		for(int i = 0; i < mybuylist.length;i++) {
			if(mybuylist[i].equals(str)) {
				mybuylist[i] = null;
				chargi += buymoney[i];
			}else {
				System.out.println("구매하지 않은 물품입니다.");
			}
		}
	}
	
	void change_1(){
		System.out.println("잔액:" + chargi);
	}
}
