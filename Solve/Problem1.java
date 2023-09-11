package Solve;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x값: ");
        double x = scanner.nextDouble();

        System.out.print("y값: ");
        double y = scanner.nextDouble();

        double sum = x + y;

        double average = sum / 2;

        System.out.println("합계는 " + sum + "입니다.");
        System.out.println("평균은 " + average + "입니다.");

        scanner.close();
    }
}