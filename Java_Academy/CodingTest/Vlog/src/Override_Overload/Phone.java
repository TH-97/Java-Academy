package Override_Overload;

public class Phone {
    String name;
    int age;
    //하위 클래스에서 재정의를 해야한다면 public 으로 외부의 접근을 허락하여야 한다
    public Phone(String name, int age){ //부모의 생성자
        this.name = name;
        this.age = age;
    }

}
