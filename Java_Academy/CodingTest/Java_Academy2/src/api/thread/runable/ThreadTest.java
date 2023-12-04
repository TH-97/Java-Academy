package api.thread.runable;

public class ThreadTest implements Runnable {
    int num;

    @Override
    public void run() {
        for(int i = 0; i <10; i++){
            Thread t = Thread.currentThread(); //현재 동작되는 쓰레드 반환
            if(t.getName().equals("A")){ //현재 쓰레드의 이름을 받아옴
                num++; // A쓰레드인 경우 num을 올린다
            }
            System.out.println("쓰레드 이름: " + t.getName() + ", 합계:" + num);
        }
    }
}
