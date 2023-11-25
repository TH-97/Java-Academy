package quiz22;

import java.util.*;
import java.util.Map.Entry;
public class MapQuiz02 {
	public static void main(String[] args) {
		//메뉴관리 프로그램
		
		//맵을 사용하고, 메뉴명을 key, 가격을 value 사용합니다.
		//
		Map<String, String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in); 
	    ex:while(true) {
			System.out.println("--메뉴 관리--");
			System.out.println("1.--메뉴 등록--");// 이미 등록된 메뉴인지 확인후에 등록
			System.out.println("2.--전체 메뉴--");
			System.out.println("3.--메뉴 수정--");// 변경할 메뉴를 받아서 메뉴가 있디면 가격을 수정
			System.out.println("4.--메뉴 삭제--");// 변경할 메뉴를 받아서 메뉴가 있다면 삭제
			System.out.println("5.--프로그램 종료--");
			
			System.out.println("메뉴명>");
			String menu = sc.next();
			
			switch (menu) {
			case "1":
				System.out.print("추가할 메뉴");
				String name	= sc.next();
				System.out.print("추가할 메뉴가격");
				String won = sc.next();
				if(!map.containsKey(name)) {
					map.put(name, won);
				}
				break;
			case "2":
				System.out.println("전체 메뉴");
				
				for(Entry<String, String> e : map.entrySet()) {
					System.out.println("메뉴: "+e.getKey() + " 가격: "+e.getValue());
				}
				break;
			case "3":
				System.out.print("가격 수정할 메뉴");
				String change_name = sc.next();
				if(map.containsKey(change_name))
					System.out.print("가격:");
					map.put(change_name,sc.next());
				break;
			case "4":
				System.out.print("메뉴 삭제");
				String del_name = sc.next();
				if(map.containsKey(del_name))
					map.remove(del_name);
				break;
			case "5":
				break ex;
		
				
				
			default:
				System.out.print("번호를 입력하시오");
				break;
			
			}
		}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
