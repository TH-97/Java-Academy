package quiz19;

import java.util.Arrays;

public class Class {
	public static void main(String[] args) {
		//프로그래머스 문제
		/*
		 * part 는 달리기 참가자 명단
		 * 
		 * com 달리기 완주자 명단
		 * comp 항상 part 길이가 1명 작습니다.
		 * 완주하지 못한 사람의 이름을 차아서 반환하는 solution메서드
		 * 
		 */
		String[] participant = {"홍길동", "홍길자", "이순신", "신사임당"};
		String[] completion = {"홍딜동", "신사입당", "이순신"};
	}
	public static String solution(String[]participant,String[]completion ) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		for(int i = 0; i < completion.length;i++) {
			if(!participant[i].equals(completion[i])){
				return participant[i];
			}
		}
		return participant[participant.length - 1];
	}

}
