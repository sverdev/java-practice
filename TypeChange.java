public class TypeChange {
    public static void main(String[] args) {
        int num1 = 1, num2 = 4;
        double result1 = num1 / num2;
        double result2 = (double) num1 / num2;
        // 위와 같은 식으로 타입을 먼저 명시하여, 값이 나오도록 해줄 수 있습니다.
        System.out.println(result1);
        System.out.println(result2);
    }
}
