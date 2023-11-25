package api.io.stream;

import java.io.FileInputStream;

public class InputStreamEx {

	public static void main(String[] args) {
		
		/*
		 * 1. 파일을 읽을 때 사용하는 클래스는 FileInputStream클래스 입니다.
		 * 2. 1byte기반으로 데이터를 읽어들입니다.
		 * 3. InputStream클래스를 상속 받고 있습니다.
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\test.txt";
		
		
		try {
			FileInputStream fis = new FileInputStream(path);
			
			//System.out.println( (char)fis.read() );
			//read() - 한글자씩 읽음, 더이상 읽을게 없다면 -1반환
			int result;
			
			while( (result = fis.read()) != -1 ) {
				System.out.println( (char)result );
			}
			
			fis.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
