package test;

import java.util.Arrays;

public class ProSafe {
	public static void main(String[] args) {
		int[][]	board = {
						{0}
						};
		int[][] board_copy = new int[board.length][board.length];
		int answer = 0;
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				if(board[i][j] == 1) {
					if(board.length == 1) {
						if(board[0][0] == 1) {
							board_copy[0][0] = 1;
						}else {
							board_copy[0][0] = 0;
						}
						break;
					}
					//[0][0]
					if(i == 0 && j == 0) {
						board_copy[i][j] = 2;
						board_copy[i][j+1] = 2;
						board_copy[i+1][j] = 2;
						board_copy[i+1][j+1] = 2;
						//[0][1,2,3]
					}else if(i == 0 && 0 < j && j < board[i].length-1) {
						board_copy[i][j] = 2;
						board_copy[i][j-1] = 2;
						board_copy[i+1][j-1] = 2;
						board_copy[i+1][j] = 2;
						board_copy[i+1][j+1] = 2;
						board_copy[i][j+1] = 2;
					//[0][4]
					}else if(i == 0 && j == board[i].length-1) {
						board_copy[i][j] = 2;
						board_copy[i][j-1] = 2;
						board_copy[i+1][j-1] = 2;
						board_copy[i+1][j] = 2;
					//[1,2,3][0]
					}else if(j == 0 && 0 < i && i < board[i].length-1) {
						board_copy[i][j] = 2;
						board_copy[i][j] = 2;
						board_copy[i-1][j+1] = 2;
						board_copy[i][j+1] = 2;
						board_copy[i+1][j+1] = 2;
						board_copy[i+1][j] = 2;
					//[1,2,3][4]
					}else if(j == board[i].length-1 && 0 < i && i < board[i].length-1) {
						board_copy[i][j] = 2;
						board_copy[i-1][j] = 2;
						board_copy[i-1][j-1] = 2;
						board_copy[i][j-1] = 2;
						board_copy[i+1][j-1] = 2;
						board_copy[i+1][j] = 2;
					// [4][0]	
					}else if(j == 0 && i == board[i].length-1){
						board_copy[i][j] = 2;
						board_copy[i-1][j] = 2;
						board_copy[i-1][j+1] = 2;
						board_copy[i][j+1] = 2;
					//[4][1,2,3]
					}else if(i == board[i].length-1 && 0 < j && j < board[i].length-1) {
						board_copy[i][j] = 2;
						board_copy[i][j-1] = 2;
						board_copy[i-1][j-1] = 2;
						board_copy[i-1][j] = 2;
						board_copy[i-1][j+1] = 2;
						board_copy[i][j+1] = 2;
					// [4][4]
					}else if(i == board[i].length-1 && j == board[i].length-1) {
						board_copy[i][j] = 2;
						board_copy[i-1][j] = 2;
						board_copy[i-1][j-1] = 2;
						board_copy[i][j-1] = 2;
					//[1,2,3][1,2,3]	
					}
					else if(i > 0  && j > 0){
						board_copy[i -1][j -1] = 2; 
						board_copy[i -1][j] = 2; 
						board_copy[i -1][j +1] = 2; 
						board_copy[i ][j -1] = 2; 
						board_copy[i][j] = 2;
						board_copy[i ][j +1] = 2; 
						board_copy[i +1][j -1] = 2; 
						board_copy[i +1][j ] = 2; 
						board_copy[i +1][j +1] = 2; 
						
					}
				}
			}
		}for(int i = 0; i < board_copy.length; i++) {
			for(int j = 0; j < board_copy.length; j++) {
				if(board_copy[i][j] == 0) {
					answer++;
				}
			}
		}
		System.out.println(answer);
		System.out.println(Arrays.deepToString(board_copy));
	}

}
