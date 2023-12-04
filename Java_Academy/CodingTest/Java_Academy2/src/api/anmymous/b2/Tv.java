package api.anmymous.b2;

public class Tv {
    private int volume;
    private RemotrControl remote;
    public Tv(){
        remote = new RemotrControl() {
            @Override
            public void turnON() {
                System.out.println("Tv를 켭니다");
            }

            @Override
            public void turnOff() {
                System.out.println("Tv를 끕니다");
            }
            //익명객체 안에서는 this키워드 사용이 불가함
            //익명객체 안에서는 지역변수의 값을 변경하는것이 불가능함
            @Override
            public void volumeUp() {
                Tv.this.volume++;
                System.out.println(volume);
            }

            @Override
            public void volumeDown() {
                volume--;
                System.out.println(volume);
            }
        };
    }

    //remoto를 외부에서 받으려면
    //setter
    public void setRemote(RemotrControl remote){
        this.remote = remote;
    }
    public RemotrControl getRemote(){
        return remote;
    }
}
