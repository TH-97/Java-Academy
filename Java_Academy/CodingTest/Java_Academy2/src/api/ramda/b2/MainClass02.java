package api.ramda.b2;

import java.util.*;
import java.util.stream.Collectors;


public class MainClass02 {
    public static void main(String[] args) {
        /*
        펑셔널인터페이스
        Consumer - 매개변수가 1개 이상이고, 반환은 void
        Predicate - 매개변수 1개 이상이고, 반환은 boolean
        Function - 매개변수가 1개 이상이고, 반환은 임의의 타입
         */
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++){
            list.add(new Random().nextInt(100) + 1);
        }

        list.stream().distinct().forEach( a -> System.out.print(a + " ")); //중복제거
        System.out.println("\n");
        //return 에 ture 인 값을만 필터링해서 저장
        //중복제거 및 필터링
        list.stream().distinct().filter( a -> a >50).forEach( a -> System.out.print(a +" "));
        System.out.println("\n");

        list.stream().sorted().forEach(a -> System.out.print(a + " "));
        //map - > 메서드 안에 정의된 내용을 기준으로 새로운 리스트를 만듬
        list.stream().map( a -> a % 2 == 0? "짝" : "홀").forEach(a -> System.out.print(a));
        System.out.println();
        list.stream().distinct().map( a -> a > 50 ? a : 0).filter( a -> a != 0).sorted().forEach(a -> System.out.print(a + " "));

        System.out.println(" ");
        Set<Integer> newList =
                list.stream()
                        .map(a -> a < 0 ? -a : a).sorted()
                        .collect(Collectors.toSet());
        System.out.println(newList);

        System.out.println(" ");

        List<String> list2=  Arrays.asList("hong", "Lee", "Part", "Choi");
        //각 이름의 최초 0글자를 얻어서 전부 대문자로 치환 하고 알파벳 순으로 정렬한 결과를 리스트로 반환 받는다
         List <String> list3=
                 list2.stream()
                    .map(a-> a.substring(0,1).toUpperCase() + a.substring(1))
                    .sorted()
                    .collect(Collectors.toList());
         System.out.println(list3);
    }
}
