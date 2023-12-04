package quiz.Thread;

import api.thread.runable.ThreadTest2;

public class MainClass {
    public static void main(String[] args) {
        // 힌트 - 2개의 객체, 2개의 쓰레드
        Download d = new Download();
        Music m = new Music();

        m.start();
        d.start();

    }
}
