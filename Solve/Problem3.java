package Solve;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정숫값(A)을 입력하세요: ");
        int a = scanner.nextInt();

        System.out.print("두 번째 정숫값(B)을 입력하세요: ");
        int b = scanner.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("양의 정수를 입력해주세요.");
        } else if (a % b == 0) {
            System.out.println(b + "는 " + a + "의 약수이다.");
        } else {
            System.out.println(b + "는 " + a + "의 약수가 아니다.");
        }

        scanner.close();
    }
}
