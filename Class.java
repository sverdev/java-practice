// 클래스는 나중에 추가로 공부해야 할 듯 함
class Student{
    //필드(Field)
    String name; //이름
    int age; //나이
    int korean_scroe; //국어성적
    int math_score; //수학성적
    int english_score; //영어성적

    //생성자(Constructor) // 워딩을 AI로 처리
    Student(String name, int age, int kor_score, int mat_score, int eng_score){
        this.name = name;
        this.age = age;
        this.korean_scroe = kor_score;
        this.math_score = mat_score;
        this.english_score = eng_score;
    }

    //메소드(Method)
    public void printScore() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("국어성적 : " + korean_scroe);
        System.out.println("수학성적 : " + math_score);
        System.out.println("영어성적 : " + english_score);
    }
}

public class Class {
    public static void main(String[] args) {
        Student a = new Student("홍길동", 18, 100, 90, 80);
        a.printScore(); //인스턴스 메소드 호출
    }
}