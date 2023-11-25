package api.io.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz01 {
	public static void main(String[] args) {
		/*
		 * 
		 * 1.스캐너를 통해서 읽어들일 파일명을 정확히 입력을 받습니다.
		 * 
		 * 2.upload폴더에 해당파일이 있으면, 이 파일을 copy 	폴더로 복사하면 됩니다.
		 * 
		 * 3. 파일명이 없다면 FileNotFoundException처리
		 * 		복사도중 에러가 나면 IOException	으로 처리
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("파일명 입력");
		String name = sc.next();
		
		String path = "/Users/yuntaehun/Desktop/test/upload.txt";
		String copypath = "/Users/yuntaehun/Desktop/test/copyupload.txt/"+ name;
		
		try {
			FileInputStream fis = new FileInputStream(path);
			FileInputStream fos = new FileInputStream(copypath);
			
			byte[] arr = new byte[1000];
			int result;
			while( (result = fis.read(arr) ) != -1 ) { 
				
				fos.write(arr, 0, result); //써내릴 배열, 시작값, 끝값
				//System.out.println(Arrays.toString(arr)  );
			}
			System.out.println("파일복사완료");
			
			fis.close(); //클로즈 안하면 두번째 실행부터 문제됨
			fos.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
