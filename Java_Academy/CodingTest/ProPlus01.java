package test;

public class ProPlus01 {
	public static void main(String[] args) {
		
		String polynomial =  "x + 0";
		// 문자열을 공백을 기준으로 쪼갠 문자열
		String[] polynomial_copy = polynomial.split(" ");
		
		int str_num = 0;
		int num = 0;
		
		for(int i = 0; i < polynomial_copy.length;i++) {
			if(polynomial_copy[i].contains("x")) {
				if(polynomial_copy[i].equals("x")) {
					str_num = str_num + 1;
					
				}else if(!polynomial_copy[i].equals("x")) {
					// replaceAll 안에 있는 모든것을 바꿔주다 (x 를, 공백으로)
					str_num += Integer.parseInt(polynomial_copy[i].replace("x",""));
					
				}
				// 이것이 제일 뒤에 나오는 이유는 위에서 x값을 걸러내줘야 하기 때문
			} else if(!polynomial_copy[i].equals("+")) {
				num = num + Integer.parseInt(polynomial_copy[i]);
			}
			
		}
		if(str_num > 1 && num > 1) {
			System.out.println(str_num + "x" + " " + "+" + " " + num );
		}
		
		if(str_num == 0) {
			System.out.println(num);
		}
		if(num == 0) {
			System.out.println(str_num + "x");
			if(str_num == 1) {
				System.out.println("x");
			}
		}
		if(str_num == 1 && num > 1 ) {
			System.out.println("x" + "+" + num);
		}
	}
}
