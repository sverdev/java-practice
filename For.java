public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("for 문이" + ( i  + 1) +"번째  반복 실행중입니다.");
        } // 일반적인 for문

        for (int i = 0; i <= 100; i++) {
            if (i%5 == 0 || i % 7 == 0) {
                System.out.println(i);
            } else {
                continue;
            } // continue 문을 활용한 for 문
        }
    }
}
