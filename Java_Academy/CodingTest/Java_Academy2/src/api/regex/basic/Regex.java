package api.regex.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        /*
        [0 ~ 9] - 숫자 0~9 1개
        [a ~ z] - 소문자 a ~ z 1개
        [0 ~ 9 a - z A - Z ] 숫자 알파벳 1개
        [가 - 힣] - 한글 1개

        ? = 0번 또는 1번 나옴
        * = 0번이상 나온다
        + = 1이상 나옴

        [0 ~ 9]? = 숫자가 안나오거나 1번 나온다
        [0 ~ 9]{3} = 숫자가 정확히 3번 나온다
        [0 ~ 9]{3,4} = 숫자가 3이상 4이하 나온다
        [0 ~ 9]{3, } = 숫자가 3이상 나온다
        () 값들의 집함

        정규표현식에서 사용하는 특수문자를 문자로 나타내고 싶은경우
        \\특수문자 Ex) \\.   \\?     \\+

        \\w - _이거나 영문자
        \\W - 반대

        \\d - 숫자
        \\D - 숫자의 반대

         */
        //여기에서 정확히 전화번호 형식만 찾아봄
        String info = "30세/서울시 강남구/02-123-4567/010-1234-5678/aaa@naver.com";

        String pattern = "[0-9]{2,3} - [0-9]{3,4} - [0-9]{4}";
        String pattern2 ="\\d{2 - 3} - d\\{2,3} - d\\{4}";

        //정규표현식을 적용은 2개
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(info); //정규표현식을 적용할 문자를 전달

        if (m.find()){
            System.out.println("찾은 문자:" + m.group());
            System.out.println("시작 위치:" + m.start());
            System.out.println("끝 위치:" + m.end());
        }
        if (m.find()){
            System.out.println("찾은 문자:" + m.group());
            System.out.println("시작 위치:" + m.start());
            System.out.println("끝 위치:" + m.end());
        }
        if (m.find()){
            System.out.println("찾은 문자:" + m.group());
            System.out.println("시작 위치:" + m.start());
            System.out.println("끝 위치:" + m.end());
        }
        //이메일 형식
        String pattern3 = "[a-zA-Z0-9] +@ [a-z] + \\.[a-z]+";






















    }
}
