package ch6;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result = mm.add(5L,3L);
        long result2 = mm.subtract(5L,3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);

        System.out.println("add(5L,3L) = " + result);
        System.out.println("add(5L,3L) = " + result2);
        System.out.println("add(5L,3L) = " + result3);
        System.out.println("add(5L,3L) = " + result4);
    }
}
