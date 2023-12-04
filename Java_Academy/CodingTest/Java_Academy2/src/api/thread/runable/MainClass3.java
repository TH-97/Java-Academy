package api.thread.runable;

public class MainClass3 {
    public static void main(String[] args) {
        //Theard객체를 상속 받았으므로
        ThreadTest2 t = new ThreadTest2();

        t.setName("A");
        t.start();
        System.out.println("main스레드 종료");
    }
}
