package test;

import java.util.Arrays;

//공원산책
/*
 * ["SOO","OXX","OOO"]	["E 2","S 2","W 1"]	[0,1]
 * 
 * 
 * 가로길이 W 세로길이 H
 */
public class Pro20 {
	public static void main(String[] args) {
		int[]answer = new int[2];
		String[] park = {"SOO","OOO","OOO"}; 
		String[] routes = {"E 2","S 2","W 1"+ ""};
		
		String[][] park_split = new String[park.length+2][park.length+2]; 
		String[][] routes_split = new String[routes.length][2];
		//x열 추가하기
		for(int i = 0; i < park_split.length; i++) {
			for(int j = 0; j < park_split.length; j++) {
				park_split[0][j] = "X";
				park_split[i][0] = "X";
				park_split[park_split.length -1][j] = "X";
				park_split[i][park_split.length -1] = "X";
			}
		}
		//park 쪼개서 2차원 배열로 만들기
		for(int i = 1; i < park_split.length -1; i++) {
			for(int j = 1; j < park_split.length -1; j++) {
				String[] park_copy = park[i-1].split("");
				park_split[i][j] = park_copy[j-1];
			}
		}
		//routes를 쪼개서 2차원 배열로 만들기
		for(int i = 0; i < routes.length; i++) {
			for(int j = 0; j < 2; j++) {
				String[] routes_copy = routes[i].split(" ");
				routes_split[i][j] = routes_copy[j];
			}
		}
		//시작지점 찾기
		for(int i = 0; i < park_split.length;i++) {
			for(int j = 0; j < park_split[0].length;j++) {
				if(park_split[i][j].equals("S")) { // equals 매개변수에 밑줄 쳐지는 이유는 값을 잘못 지정해줬을 이유가 크다
					answer[0] = i;
					answer[1] = j;
				}
			}
		}
		System.out.println(Arrays.toString(answer));
		//시작지점에서 이동하기
			int up_down = Integer.parseInt(routes_split[i][1]);
			for(int i = 0; i < up_down;i++) {
				if(routes_split[i][0].equals("N")) {
					if(park_split[answer[0]+1][answer[1]].equals("X")) {
						continue;
					}else {
						answer[0] -= 1;
						break;
					}
					
				}if(routes_split[i][0].equals("S")) {
					if(park_split[answer[0]-1][answer[1]].equals("X")) {
						continue;
					}else {
						answer[0] += 1;
						break;
					}
				}if(routes_split[i][0].equals("W")) {
					if(park_split[answer[0]][answer[1]+1].equals("X")) {
						continue;
					}else {
						answer[1] += 1;
						break;
					}
				}if(routes_split[i][0].equals("E")) {
					if(park_split[answer[0]][answer[1]-1].equals("X")) {
						continue;	
					}else {
						answer[1] -= 1;
						break;
					}
				}
			}
			
	
//		answer[0] -= 1;
//		answer[1] -= 1;
		System.out.println(Arrays.deepToString(park_split));
		System.out.println(Arrays.deepToString(routes_split));

		System.out.println(Arrays.toString(answer));
	}
}
