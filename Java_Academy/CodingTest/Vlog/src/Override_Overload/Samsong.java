package Override_Overload;

public class Samsong extends Phone {
    String type = "android";
    public Samsong(String name, int age) { //자식의 생성자에서 재 정의 즉 오버라이딩
        super(name, age);
    }
    public void info(){
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("타입: " + type);

    }
}
