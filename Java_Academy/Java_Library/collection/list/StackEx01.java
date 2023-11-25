package api.collection.list;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StackEx01 {
	public static void main(String[] args) {
		
		
		Stack<String> stack = new Stack<String>();
//		Vector<String> stack1 = new Stack<String>();
//		List<String> list = new Stack<String>();
		
		stack.push("홍딜동");
		stack.push("이순신");
		stack.push("홍길자");
		
		//컬렉션의 값을 문자열 형태로 출력(공용)
		System.out.println(stack.toString());
		
		//컬렉션의 사이즈 출력(공용)
		System.out.println(stack.size());
		
		//컬렉션이 비었는지 확인하는 기능
		System.out.println(stack.isEmpty());
		
		//삭제와 동시에 반환
		String v1 = stack.pop();
		String v2 = stack.pop();
		String v3 = stack.pop();
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		System.out.println(stack.toString());
		
	}

}
