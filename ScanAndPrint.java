import java.util.Scanner;
public class ScanAndPrint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Scanner 를 통해서 입력을 받고 그 값을 변수에 저장해둠
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.printf("%d * %d은 %d 입니다.\n", x,y,x * y);
    }
}
