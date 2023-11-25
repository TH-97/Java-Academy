package test;

public class Pro20_1 {
	public static void main(String[] args) {
		int[] answer = new int[2];
		String[] park = {"SOO","OXX","OOO"}; 
		String[] routes = {"E 2","S 2","W 1"};
		

		int hight = park.length;
		int weight = park[0].length();
		//시작지점 찾기
		for(int i = 0 ; i < park.length;i++) {
			if(park[i].indexOf("S") != -1) {
				answer[0] = park[i].indexOf("S");
				answer[1] = i;
				break;
			}
		}
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		// 방향을 찾고 보내기
		for(int i = 0; i < routes.length; i++ ) {
			String[] routes_split = routes[i].split(" ");
			String where = routes_split[0];
			int go = Integer.parseInt(routes_split[1]);
			
			if(where.equals("E")) {
				for(int i1 = 0; i1 < go;i1++) {
					if(answer[0] < weight && answer[0] >= 0 && park[i].indexOf("X") != answer[1]-1) {
						answer[1]--;
					}
				}
			}
			if(where.equals("W")) {
				for(int i2 = 0; i2 < go; i2++) {
					if(answer[0] < weight && answer[0] >= 0 &&  park[i].indexOf("X") != answer[1]+1) {
						answer[1]++;
					}
				}
			}
			if(where.equals("S")) {
				for(int i3 =0; i3 < go; i3++) {
					if(answer[0] < hight && answer[0] >= 0 &&  park[i].indexOf("X") != answer[1]+1) {
						answer[0]++;
					}
				}
			}
			if(where.equals("N")) {
				for(int i4 = 0; i4 < go; i4++) {
					if(answer[0] < hight && answer[0] >= 0 &&  park[i].indexOf("X") != answer[1]+1) {
						answer[0]--;
					}
				}
				
			}
		}
	}

}
