package Solve;
import java.util.Random;
public class Problem2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n1 = rand.nextInt(10);
        int n2 = rand.nextInt(9) - 8; // 수정 필요
        int n3 = rand.nextInt(90) + 10;

        System.out.println("3개의 난수를 생성했습니다.");
        System.out.println("한 자리의 양의 정수: "+n1);
        System.out.println("한 자리의 음의 정수: "+n2);
        System.out.println("두 자리의 양의 정수: "+n3);

    }
}
