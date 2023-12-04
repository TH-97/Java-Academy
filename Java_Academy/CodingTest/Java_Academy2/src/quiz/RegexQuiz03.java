package quiz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz03 {
    public static void main(String[] args) {
        //원본과제 - 파일을 읽어서 (날짜,지점,등급,내용,가격)형태

        /*
        1.건담.txt파일을 한줄씩 읽어 들입니다.
        2.Product객체(날짜, 지점, 등급, 내용, 가격)를 가지는 생성을 합니다
        3. 한 행에 대한 내용을 Product객체에 담고, 리스트에 담는다.
         */
        String str1 = "20180429-02-002420180429 건담베이스 고속터미널 " +
                "[MG스텐드] 1/144 고기동형 자쿠II (가이아/맛슈 전용기... 1 24000원";
        String pattern1 = "[0-9]+-[0-9]{2}-[0-9]+";               //날짜
        String pattern2 = "[가-힣]+ [\\t\\n\\x0B\\f\\r]?[가-힣]+";  //지점
        String pattern3 = "\\[[가-힣A-Z]+\\]";                     //등급
        String pattern4 = "(1<=)";                         //내용


        Matcher m = Pattern.compile(pattern4)
                .matcher(str1);
        if (m.find()){
            System.out.println(m.group());


        }
    }
}
