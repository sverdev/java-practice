public class NumberType {
    public static void main(String[] args) {
        int i;
        double d;
        byte b;

        i = 7/4;
        System.out.println(i);
        //출력은 1이다. 이유는 정수형으로 계산하였기 때문이다.

        d = 7/5;
        System.out.println(d);
        //출력은 1.0이다. 이유는 실수형으로 계산하였기 때문이다.

        d = 7/(double)4;
        System.out.println(d);
        //출력은 1.75이다. 이유는 정수형으로 계산이지만 소수점 자리까지 계산해주는 Byte를 사용하였기 때문이다.

        i = 300;
        if(i < Byte.MIN_VALUE || i > Byte.MAX_VALUE)
            System.out.println("Byte 타입으로 변환할 수 없습니다.");
            // Byte는 범위가 -128~127로 범위에 부합하지 않아서 생기는 오류입니다.
        else
            b = (byte)i;
    }
}
