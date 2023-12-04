package api.ramda.b2;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainClass3 {
    public static void main(String[] args) {
        /*
        Stream의 타입

        Stream - 오리지널 스트림
        IntStream - 정수저장스트림
        DoubleStream - 실수저장스트림
        LongStream - 롱타입 저장 스트림
        Optional - 이외의 것들을 저장 스트림
         */
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 20;i++)
            list.add(new Random().nextInt(100) + 1);
        System.out.println(list.toString());
        //평균 합계 개수 등 집계 기능을 사용하려면 정수형 스트림으로 변경
        //mapToXXX()
        long cnt =  list.stream().mapToInt(a -> a).count(); //count - 최종함수

        int sum = list.stream().mapToInt(a -> a).sum(); // 최종함수 - sum
        System.out.println("데이터 합계: " + sum);
        //optionalXX는 특정한 값을 저장하고 있는 객체, 값을 얻을때는 get메서드를 사용함
        double avg = list.stream().mapToInt(a -> a).average().getAsDouble();
        System.out.println("데이터의 평균 " + avg);

        int min = list.stream().mapToInt(a -> a).min().getAsInt();
        System.out.println("최소값:" + min);
        //boxed() -> 정수 스트림을 오리지널 스트림으로 형변환

        list.stream().mapToDouble(a -> a).boxed();
        //Reduce -> 사용자가 정의한 합계를 구할 수 있는 최종메서드
        List<String> list2 = Arrays.asList("a","b","c","d","e"); //
        //a가 초기값 b가 요소
        String result= list2.stream().reduce((a,b) -> a+b).get();// 합치기
        System.out.println(result);

        System.out.println("---");


        //정수 스트림을 빠르게 만드는법
        // 0~ 10미만 값을 인트 스트림으로 생성
        IntStream.range(0,10).forEach( a -> System.out.print(a+ " "));
        // 0~ 10까지 값을 인트 스트림으로 생성
        IntStream.rangeClosed(0,10).forEach( a -> System.out.print(a + " "));
        System.out.println("---");
        // 1 ~ 100까지 값을 저장하는 리스트
         List<Integer> list3 = IntStream.rangeClosed(1,100).boxed().collect(Collectors.toList());
         System.out.print(list3);

    }
}
