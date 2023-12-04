package api.thread.runable;

//Thread 클래스 상속
public class ThreadTest2 extends Thread{
    int sum;
    public void run(){
        for(int i = 1; i <= 10; i++){
            if(getName().equals("A")){
                sum++;
            }
            System.out.println("쓰레드 이름:" + getName() + ", 합계:" + sum);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
