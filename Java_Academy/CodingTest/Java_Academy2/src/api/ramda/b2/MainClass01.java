package api.ramda.b2;

import java.util.ArrayList;
import java.util.List;

public class MainClass01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("피카츄");
        list.add("라이츄");
        list.add("꼬북이");

        for(String s : list) {
            System.out.println(s);
        }

        list.stream().forEach( a -> System.out.println(a));

    }
}
