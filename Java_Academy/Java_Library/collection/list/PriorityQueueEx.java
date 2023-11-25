package api.collection.list;

import java.util.PriorityQueue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		
		//우선순위 q
		
		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		
		que.offer(3);
		que.offer(4);
		que.offer(3);
		que.offer(1);
		que.offer(2);
		
		System.out.println(que.toString());
		
		//데이터꺼내기
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		
		System.out.println("---");
		
		//객체를 Que에 넣는다
		//객체를 Que 넣을 때는 우선순위를 지정하는 방법이 정의 되어야 합니다.
		
		PriorityQueue<Person> q = new PriorityQueue<Person>();
		// 값을 넣을때는 무조건!!!!!! 객체를 생성해서 넣어라 제발
		
		
		q.offer( new Person("홍길동", 20));
		q.offer( new Person("홍길자", 30));
		q.offer( new Person("이순신", 40));
		q.offer( new Person("피카츄", 50));
		
		System.out.println(q.poll());
		
		
	}

}
