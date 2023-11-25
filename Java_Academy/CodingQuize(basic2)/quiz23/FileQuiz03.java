package quiz23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class FileQuiz03 extends Data{
	public static void main(String[] args) {
		
		/*
		 * 연화가 입사한 회사에서는 매일 오전 7시에 연계사에서 날짜유형의 csv파일을 전송을 해줍니다.
		 * 
		 * ex) 2023_11_24_data.csv 유형의 파일입니다
		 * 그래서 연화는 매일 아침마다 csv파일을 읽어서 데이터 베이스에 저장하는
		 * 프로그램 코드를 만들어야 합니다.
		 * 
		 * 1.buffered 사용해서 날짜_data.csv파일을 읽어서 한줄 한줄씩 출력해주세요.
		 * 2. 읽은 데이터를, 기준으로 분리해서 Data객체에 저장하고 리스트에 저장하세요
		 */
		
		String path = "/Users/yuntaehun/Desktop/test/2023_11_24_data.csv";
		try { 
	
			
			BufferedReader br = new BufferedReader( new FileReader(path) );
			String str;
			while( (str = br.readLine()) != null  ) {
				System.out.println(str);
				StringTokenizer st = new StringTokenizer(str,", ");
				ArrayList<String> token_list = new ArrayList<>(); 
				while (st.hasMoreTokens()) {
					token_list.add(st.nextToken());
					System.out.println(token_list.toString());
					}
				Data data = new Data(token_list);
			}
			
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
