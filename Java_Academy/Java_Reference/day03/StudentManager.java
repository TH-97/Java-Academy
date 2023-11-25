package day03;

import java.util.Scanner;

public class StudentManager {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//배열의 크기는 신경 X
		String[] nameList = new String[100];
		int[] ageList = new int[100];
		
		//현재 고객수가 몇명이 저장되어있는지 알기 위한 변수.
		int count = 0;
		
		ex:while(true) {
			//메뉴
			System.out.println("[info]-고객수:" + count);
			System.out.println("[메뉴]1.추가, 2.전체보기, 3.정보검색, 4.정보수정, 5정보삭제, 6.나가기");
			System.out.print("메뉴입력>");
			String menu = sc.next();
			
			switch(menu) {
			
			case "1":
				System.out.println("=고객 정보 입력=");
				/*
				 * 1. 이름과 나이를 입력받고 배열에 순서대로 값을 저정합니다
				 * 2. count 값을 증가
				 */
				for(int i = count; i < count +1 ; i++) {
					System.out.print("이름>");
					nameList[i] = sc.next();
					System.out.print("나이>");
					ageList[i] = sc.nextInt(); 
				}
				count++;
				System.out.println("=============");
				break;
			case "2":
				System.out.println("=전체 고객 정보 출력=");
				/*
				 * 1.배열에 저장된 고객정보 name의 나이는 age입니다 출력
				 */
				for(int j = 0; j < count;j++) {
					System.out.println(nameList[j]+ "의 나이는" + ageList[j]+ "입니다");
				}
				System.out.println("=============");
				break;
			case "3":
				System.out.println("=고객 정보 검색=");
				/*
				 * 1.이름을 입력 받아서
				 * 2. 배열에서 이름을 찾은 후에,"name님은 x번째에 있습니다.
				 * 						  "name님의 나이는 age입니다"
				 * 3.혹시 찾는 이름이 없다면, "name님의 정보는 없습니다"
				 */
				 System.out.println("정보 검색할 이름>");
				 String name = sc.next();
				 for(int k = 0; k < name.length();k++) {
					 if(nameList[k].equals(name)) {
						 System.out.println(name + "님은" + k +"번째에 있습니다");
						 System.out.println(name + "님은 나이는" +	ageList[k] +"입니다");
						 break;
					 }else if(!nameList[k].equals(name)) {
						 System.out.println(name + "님은 정보는 없습니다");
						 break;
					 }
				 }
				System.out.println("=============");
				break;
			case "4":
				System.out.println("=고객 정보 수정=");
				/*
				 * 1. 먼저 모든 name을 출력해서 볼 수 있게
				 * 2. 수정할 이름을 입력 받습니다.
				 * 3. 해당이름을 배열에서 찾은 후에, name과 age를 다시 입력 받습니다.
				 * 4. 입력받 name과,age 수정해주면 됩니다.
				 * 5. 잘못 입력된 경우는 "name님은 없습니다" 로 출력
				 */
				for(int q = 0; q < count;q++) {
					System.out.print(nameList[q]);
				}
				System.out.println("수정할 이름>");
				String name2 = sc.next();
				for(int l = 0; l < nameList.length;l++) {
					if(nameList[l].equals(name2)) {
						System.out.print("수정될 이름>");
						String name_change = sc.next();
						System.out.print("수정될 나이>");
						int age_change = sc.nextInt();
						nameList[l] = name_change; 
						ageList[l] = age_change;
						break;
					}else if(!nameList[l].equals(name2)) {
						System.out.println(	name2 + "님은 없습니다.");
						break;
					}
				}
				System.out.println("=============");
				break;
			case "5":
				System.out.println("=고객 정보 삭제=");
				/*
				 * 1. 먼저 모든 name을 출력해서 볼 수 있게 처리
				 * 2. 삭제할 이름을 입력 받기
				 * 3. 이름이 어느 위치에 있는지 찾고, 찾은위치에서부터 count미만 값을 하나씩 당겨옵니다. 반복의 중첩
				 * 4. count위치는 null,0 초기화 하고
				 */
				// 정보 보기위한 반복문
				for(int q = 0; q < count;q++) {
					System.out.print(nameList[q]+ " ");

				}
				// 이름을 삭제하기 위한 반복문
				System.out.println("삭제할 이름>");
				String name_del = sc.next();
				for(int z = 0; z < count; z++) {
					if(nameList[z].equals(name_del)) {
						for(int j = z; j < count -1; j++) {
							nameList[j] = nameList[j+1];
							ageList[j] = ageList[j+1];
						}
						
						nameList[count-1] = null;
						ageList[count-1] = 0;
						count--;
//						nameList[z] = nameList[z +1];
//						nameList[z+1] = null;
//						ageList[z] = ageList[z];
//						ageList[z+1] = 0;
//						count--;
//						break;
					}
				}
				
				
				System.out.println("=============");
				break;
			case "6":
				System.out.println("=============");
				System.out.println("=프로그램 종료=");
				System.out.println("=============");
				/*
				 * while문 탈출
				 */
				
				
				break ex;
			default :
				System.out.println("================");
				System.out.println("=메뉴는 숫자로 입력=");
				System.out.println("================");
				break;
			}sc.close();
		}
	}

}
