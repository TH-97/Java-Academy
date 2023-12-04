package quiz.Thread;

public class Download extends Thread{
    String com = "";
    public void run(){
        for(int i = 1; i <= 10; i++){
            com += "*";
            System.out.println("동영상을 다운로드 합니다:" + com);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("다운로드가 완료되었습니다");

    }
}
