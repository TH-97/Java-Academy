package test;

import java.util.Arrays;

public class Pro12 {
	public static int solution(String[] babbling) {
        int answer = 0;
        
        String[] can = {"aya","ye","woo","ma"};
        String[] can_1 = babbling;

        for(int i = 0; i < babbling.length;i++) {
        	for(int j = 0; j < can.length;j++) {
        		if(babbling[i].contains(can[j])) {
            		can_1[i] = can_1[i].replace(can[j],"0");
            		}
        	}
        }
        for(int i = 0; i < babbling.length;i++) {
        	can_1[i] = can_1[i].replace("0","");
        }
        for(int i = 0;  i < can_1.length;i++) {
        	if( can_1[i].equals("")) {
        		answer++;
        	}
        }

        System.out.println(Arrays.toString(can_1));
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {


        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};


        System.out.println(solution(babbling));

    }
}