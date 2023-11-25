package api.collection.list;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
	public static void main(String[] args) {
		
		//양쪽방향에서 삽입삭제 가능한 Que
//		ArrayDeque<Integer> uqe = new ArrayDeque<>();
		
		Deque<Integer> que = new ArrayDeque<>();
		
		que.offerLast(3);
		que.offerLast(4);
		que.offerLast(1);
		que.offerLast(2);
		
		System.out.println(que.toString());
		System.out.println(que.pollFirst());
		
		//앞에서 삽입
		que.offerFirst(1);
		que.offerFirst(2);
		que.offerFirst(3);
		que.offerFirst(4);
		
		System.out.println(que.toString());
		
		//뒤에서 삭제
		System.out.println(que.pollLast());
		System.out.println(que.pollLast());
		System.out.println(que.pollLast());
		System.out.println(que.pollLast());
		
		System.out.println(que.toString());
		//peek -값을 확인
		
		System.out.println(que.peek());
		System.out.println(que.peek());
		System.out.println(que.peek());
		
	}

}
