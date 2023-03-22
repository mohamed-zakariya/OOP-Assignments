import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner input = new Scanner(System.in);
        double s1,s2,s3;
        s1 = input.nextDouble();
        s2 = input.nextDouble();
        s3 = input.nextDouble();

        String color;
        boolean filled;

        color = input.next();
        filled = input.nextBoolean();

        Triangle t1 = new Triangle(s1, s2, s3, color,filled);

        System.out.println(t1);
    }
}