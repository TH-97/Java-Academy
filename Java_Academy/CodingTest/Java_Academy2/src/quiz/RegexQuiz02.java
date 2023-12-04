package quiz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {
    public static void main(String[] args) {
        String str1 = "123123-45644 GS25(치킨도시락) 4,400원";
        String str2 = "123123-3453454 GS25(마늘햄쌈) 5,000원";
        String str3 = "123456-3453 GS(갓혜자도시락) 6,000";
        String[] str_list = {str1,str2,str3};

        //상품번호 , gs25, (상품명) ,가격 분리해서 출줄에
        //1줄에 대해서 패던이 4개나오고 , 문자열을 가각 처리하는 반복(중첩 반복)
        String pattern1 = "[0-9]*([,][0-9])*";
        String pattern2 = "[0-9]{6}-[0-9]{4,}";
        String pattern3 = "\\([가-힣]+\\)";
        String pattern4 = "[A-Z]+[0-9]?[0-9]?";
        String[] pattern_list = {pattern1,pattern2,pattern3,pattern4};

        for (int i = 0; i < str_list.length;i++ ){
            for (int j = 0; j < pattern_list.length ;j++){
                Matcher m = Pattern.compile(pattern_list[j]).matcher(str_list[i]);
                if (m.find()){
                    System.out.println(m.group());
                }

            }
            System.out.println("-----");
        }

    }
}
