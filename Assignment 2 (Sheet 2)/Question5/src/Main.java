public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyInteger v1 = new MyInteger(5);
        MyInteger v2 = new MyInteger(6);
        System.out.println(v1.isEven());
        System.out.println(v1.isOdd());
        System.out.println(v1.isPrime());

        System.out.println(MyInteger.isEven(13));
        System.out.println(MyInteger.isOdd(11));
        System.out.println(MyInteger.isPrime(10));

        System.out.println(v1.equals(5));
        System.out.println(v1.equals(v2));
    }
}