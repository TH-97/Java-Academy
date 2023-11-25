package api.io.stream;

import java.io.FileWriter;
import java.util.Scanner;

public class FileQuiz02 {
	public static void main(String[] args) {
		
		/*
		 * 1. 파일명을 입력 받습니다.
		 * 2.사용자가 그만을 입력할 때까지, 작성할 내용을 입력 받습니다.
		 * 3. 사용자가 그만을 입력했다면,  마지막에 단 1번으로 파일을 써내립니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명>");
		String name = sc.next();
		
		String path = ""+ name;
		
		try {
//			String build = sc.next();
//			if(build.equals("그만")) {
//				sc.
//			}
			String
			FileWriter fw = new FileWriter(path, true); //기존파일에 내용을 추가함
			
			String str = "아 쉬는시간이네?\n\r집에가고싶다"; // \r캐리지리턴
			fw.write(str);
			
			fw.close();
			
			System.out.println("파일생성완료");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
