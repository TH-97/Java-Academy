package quiz21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/////////////////////////////////////////////////////////////
		//////////////////////리스트를 생성하세요///////////////////////////
		/////////////////////////////////////////////////////////////
		List<User> list = new ArrayList<>();
		
		//현재 고객수가 몇명이 저장되어있는지 알기 위한 변수.
		int count = 0;
		
		ex:while(true) {
			
			//메뉴
			System.out.println("[Info]-고객수:" + count);
			System.out.println("[메뉴]1.추가, 2.전체보기, 3.정보검색, 4.정보수정, 5.정보삭제, 6.나가기");
			System.out.print("메뉴입력>");
			String menu = sc.next();
			
			switch(menu) {
			
			case "1":
				System.out.println("=========고객 정보 입력==========");
				/*
				 * 1. 이름과, 나이를 입력받고, 리스트 <User>에 순서대로 값을 저장합니다.
				 * 2. count값을 증가
				 * 
				 */
				System.out.print("이름>");
				String name = sc.next();
				System.out.print("나이>");
				int age = sc.nextInt();
				list.add(new User(name, age));
				count++;
				
				System.out.println("=============================");
				break;
			case "2":
				System.out.println("========전체 고객정보 출력=========");
				/*
				 * 1. 배열에 저장된 고객정보 "name~님의 나이는 age입니다." 전부출력 
				 */
				for(int i = 0 ; i < list.size();i++) {
					System.out.println(list.get(i).getName()+"님의 나이는" + list.get(i).getAge()+ "입니다" );
				}
			
				System.out.println("=============================");
				break;
			case "3":
				System.out.println("==========고객 정보 검색==========");
				/*
				//찾을 이름을 입력받습니다. 이름이 있다면, 이름과 나이를 출력합니다.
				//찾는 이름 없다면 "~~님은 목록에 없습니다" 를 출력합니다.
				 */
				System.out.print("찾을 이름>");
				String find = sc.next();
				for(int i = 0 ; i < list.size();i++) {
					if(list.get(i).getName().equals(find)) {
						System.out.println(list.get(i).getName()+"님의 나이는" + list.get(i).getAge()+ "입니다" );
						break;
					}else {
						System.out.println("찾는 이름이 없습니다.");
						break;
						
					}
				}
				
				
				System.out.println("=============================");
				break;
			case "4":
				System.out.println("==========고객 정보 수정=========");
				/*
				 * 1. 모든 list에 저장된 정보를 출력해줍니다.
				 * 2. 수정할 index를 입력 받습니다.
				 * 3. 수정할 name, age으로 수정합니다.
				 */
				for(int i = 0 ; i < list.size();i++) {
					System.out.println(list.get(i).getName() + list.get(i).getAge() );
				}
				System.out.println("수정할 이름을 입력하시오:");
				String find_name2 = sc.next();
				System.out.println("수정될 이름>");
				String fix_name = sc.next();
				System.out.println("수정될 이름의 나이");
				int fix_age = sc.nextInt();
				for(int i = 0; i < list.size(); i++) {
					if(list.get(i).getName().equals(find_name2)) {
						list.set(i, new User(fix_name, fix_age) );
						break;
					}
				}
				System.out.println("=============================");
				break;
			case "5":
				System.out.println("==========고객 정보 삭제==========");
				/*
				 * 1. 먼저 모든 name을 출력해서 볼 수 있게 처리
				 * 2. 삭제할 이름을 입력을 받습니다.
				 * 3. 이름이 있다면 객체 삭제
				 */
				for(int i = 0 ; i < list.size();i++) {
					System.out.println(list.get(i).getName()+" ");
				}
				System.out.print("삭제할 이름을 입력하시오:");
				String sc_name = sc.next();
				for(int i = 0;i < list.size();i++) {
					if(list.get(i).getName().equals(sc_name)) {
						list.remove(i);
						break;
					}
				}
				
				System.out.println("=============================");
				break;
			case "6":
				System.out.println("=============================");
				System.out.println("===========프로그램 종료==========");
				System.out.println("=============================");
				
				//while탈출 하면 됩니다.
				sc.close();
				break ex;
				
			default :
				System.out.println("===========================");
				System.out.println("========메뉴는 숫자로 입력=======");
				System.out.println("===========================");
				break;
			}
			
			
		}
		
		
		
		
		
		
		
		
		
	}
}
