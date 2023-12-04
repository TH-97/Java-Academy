package quiz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {
    public static void main(String[] args) {
        String str = "헠4력,500원 크크크 1,200원?? 60000원엨 120000원";
        String pattern = "[0-9]([,-]?[0-9])*원";

        Matcher m = Pattern.compile(pattern).matcher(str);

        if (m.find()){
            System.out.println(m.group());
        }
        if (m.find()){
            System.out.println(m.group());
        }
        if (m.find()){
            System.out.println(m.group());
        } if (m.find()){
            System.out.println(m.group());
        }


    }
}
