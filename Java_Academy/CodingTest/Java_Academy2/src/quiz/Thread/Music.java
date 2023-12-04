package quiz.Thread;

public class Music extends Thread{

    public void run(){
        System.out.println("음악을 15초간 재생합니다");
        for(int i = 1; i <= 15; i++){
            System.out.println("링딩동~!");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("음악재생이 끝났습니다.");
    }
}
