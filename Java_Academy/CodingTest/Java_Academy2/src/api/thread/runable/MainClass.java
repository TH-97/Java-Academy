package api.thread.runable;

public class MainClass {
    public static void main(String[] args) {
        //메인도 하나의 쓰레드로 동작을 합니다.

        //쓰레드를 동작시키려면 Thread객체를 생성합니다.
        ThreadTest t = new ThreadTest();

        Thread thread = new Thread();
        thread.start();
        System.out.println("Main 쓰레드 종료");
        //쓰레드 일시정지
        try {
            Thread.sleep(1000);//1초 일시정지
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
