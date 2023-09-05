public class Array {
    public static void main(String[] args) {
        int[] first = new int[3];
        // 인덱싱 번호는 0부터 시작된다. 이 부분은 다른 언어와 같다.
        first[0] = 1;
        System.out.println(first[0]);
        // 타입[] 배열 이름 = new 타입[배열 길이]
        first = new int[]{1,2,3};
        // 위는 배열 초기화 방법, 만약 first = {1,2,3}; 형태로 하면 에러가 발생한다.
        /*1. 타입[] 배열이름 = {배열요소1, 배열요소2, ...};
          2. 타입[] 배열이름 = new 타입[]{배열요소1, 배열요소2, ...};*/
        // 위와 같이 2가지 방식이 있는데, 여기서 2번째와 같은 방법을 사용하는 이유에는 배열 크기를 유연하게 조정하기 위함이다.

        // 2차원 배열
        int[][] third = new int[2][3];
        int a = 10;
        for (int i=0; i < third.length; i++) {
            //third.length 만큼 [2][3]이니 1,2
            for (int j=0; j < third[i].length; j++) {
                //인덱싱 수에 위의 i를 대입 해주며 그곳에 값을 넣어준다.
                third[i][j] = a;
                a += 10;
            }
        }
        for (int i=0; i < third.length; i++) {
            for (int j = 0; j < third[i].length; j++) {
                System.out.print(third[i][j]+" ");
                //공백과 함께 값을 함께 출력해준다. 여기서도 인덱싱을 모두 불러오기 위해서 i,j 를 사용하는걸 볼 수 있다.
            }
            System.out.println();
        }

        //배열 마지막!!
        int[][] lastarr = {
                {10, 20, 30},
                {40, 50, 60}
        };
        /*
         가변 배열인데, 상황마다 다를 수 있으나 열의 길이를 명시하지 않음으로써 더 편리하긴 한거 같다.
         물론 무결성 검사등이 필요한 상황에는 맞지 않을 듯 하다.
        */

        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int newLen = 10;
        int[] arr2 = new int[newLen];
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        //System.arraycopy(원본 배열, 원본의 시작 인덱스 번호, 대상 배열, 대상의 시작 인덱스 번호, 복사할 요소의 수);
    }
}