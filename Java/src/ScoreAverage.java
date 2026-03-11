
//OOP 출발점
//1. 모든 멤버변수 접근제한자 private

import java.util.ArrayList;

class MyPerson {
    int age;
    String name;
    int score1;
    int score2;
    int score3;
    int[] score = new int[10];
    int e = 0;

    public MyPerson(String n, int a, int s1, int s2, int s3) {
        name = n;
        age = a;
        score1 = s1;
        score2 = s2;
        score3 = s3;
    }

    public void 성적평균구하기() {
        int result = score1 + score2 + score3;
        e = result / 3;
    }

    public void 성적표출력() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("성적 평균: " + e);
    }

}

public class ScoreAverage {

    public static void main(String[] args) {
        MyPerson m1 = new MyPerson("김길동", 20, 90, 80, 70);
        //int result = m1.score1 + m1.score2 + m1.score3;
        //int e = result / 3;
        m1.성적평균구하기();
        m1.성적표출력();
//        System.out.println("이름: " + m1.name);
//        System.out.println("나이: " + m1.age);
//        System.out.println("성적 평균: " + m1.e);

        MyPerson m2 = new MyPerson("박길동", 20, 100, 100, 90);
//        m2.name = "박길동";
//        m2.age = 20;
//        m2.score1 = 100;
//        m2.score2 = 100;
//        m2.score3 = 90;

//        int result2 = m2.score1 +  m2.score2 + m2.score3;
//        int average2 = result2 / 3;

        m2.성적평균구하기();
        m2.성적표출력();
//        System.out.println("이름: " + m2.name);
//        System.out.println("나이: " + m2.age);
//        System.out.println("성적 평균: " + m2.e);

        MyPerson m3 = new MyPerson("홍길동", 22, 90, 80, 90);
        m3.성적평균구하기();
        m3.성적표출력();

        //ArrayList 객체를 여러 개 저장할 수 있는 공간
        ArrayList mTotal = new ArrayList();
        mTotal.add(m1); //mTotal m1객체 저장
        mTotal.add(m2);
        mTotal.add(m3);
        mTotal.add("ABC");

//        public void add ( Object x ) { 모든 클래스는 Object를 상속받고 있음.
//        }

//        public Object get ( int index ) {
//        }
        int result = 0;
        for (int i = 0; i<3; i++) {
            MyPerson t = (MyPerson)mTotal.get(i); //ArrayList에서 값 가져올때는 순서(index)를 기준으로 가져옴
            result += t.score1 + t.score2 + t.score3;
        }

    }
}