package ch6;

public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.wight);
        System.out.println("Card.hegth = " + Card.height); //클래스 변수는 객체생성 없이 '클래스이름.클래스변수로' 직접 사용 가능하다

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + " 이며, 크기는 (" + c1.wight +", " +c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + " 이며, 크기는 (" + c2.wight +", " +c2.height + ")");

        c1.wight = 50; //변수 값을 변경한다
        c1.height = 80;

        System.out.println("c2은 " + c2.kind + ", " + c2.number + " 이며, 크기는 (" + c2.wight +", " +c2.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + " 이며, 크기는 (" + c2.wight +", " +c2.height + ")");
    }
}
