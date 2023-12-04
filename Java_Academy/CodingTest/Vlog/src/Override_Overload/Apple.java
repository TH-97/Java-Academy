package Override_Overload;

public class Apple extends Phone {
    String type = "ios";
    public Apple(String name, int age) {
        super(name, age);

    }
    public void info(){
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("타입: " + type);

    }
}
