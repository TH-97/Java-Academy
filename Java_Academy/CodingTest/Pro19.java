package test;
//최빈값 구하기

/*
 * array				result
[1, 2, 3, 3, 3, 4]		3
[1, 1, 2, 2]			-1
[1]	1
 */
public class Pro19 {
	public static void main(String[] args) {
		int[] array = {1,2,2,4,3,3,3,7,8};
		int total = 0;
		if(array.length == 1) {
			total = array[0];
		}
		for(int i = 0; i < array.length-1;i++) {
			int a = 0;
			int count = 1;
			if(array[i] == array[i+1]) {
				count++;
				int f = array[i] + array[i+1];
				a = f / count;
				if(total < a) {
					total = a;
				}
			}
		}
		
		System.out.println(total);
	}

}
