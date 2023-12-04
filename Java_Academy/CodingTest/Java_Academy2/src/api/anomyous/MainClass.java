package api.anomyous;

import api.anmymous.b2.RemotrControl;
import api.anmymous.b2.Tv;

public class MainClass {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.getRemote().turnON();
        tv.getRemote().volumeUp();
        tv.getRemote().turnOff();

    }
}
