//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.FileReader;
//import java.io.InputStreamReader;
//
//public class BufferredEncoding {
//    public static void main(String[] args) {
//        //인코딩 - 인간이 사용하는 문자데이터를 컴퓨터가 아는 문자형태로 표현하는 것
//        //한글은 인코딩타입이 맞지 않으면 전부 깨지는 현상이 발생함
//
//        String path = "/Users/yuntaehun/Desktop/test/hi.txt";
//        try {
//            //인코딩을 지정해서 파일을 읽어 들이는 방법
//            FileInputStream fis = new FileInputStream(path);
//            InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
//            BufferedReader br = new BufferedReader(new FileReader(isr));
//
//            String str;
//            while( (str = br.readLine()) != null){
//                System.out.println(str);
//            }
//            br.close();
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//}
