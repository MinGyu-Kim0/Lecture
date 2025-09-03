
//OOP 출발점
//1. 모든 멤버변수 접근제한자 private

class MyPerson {
    int x1, x2, x3;

    public void average() {
        int sum = x1 + x2 + x3;

        int average = sum / 3;

        System.out.println(average);
    }
}

public class ScoreAverage {

    public static void main(String[] args) {
        MyPerson person = new MyPerson();

        person.x1 = 100;
        person.x2 = 90;
        person.x3 = 80;

        //평균 구하기 메소드 호출
        person.average();

        MyPerson person2 = new MyPerson();

        person2.x1 = 70;
        person2.x2 = 80;
        person2.x3 = 60;

        person2.average();




    }
}
