//OOP : 유지보수 관리가 편리한 프로그램
//OOP에 출발점은
//멤버변수 private 선언 부터
//추가로 public getXXX/setXXX 메소드 구현

class MyStudent {
    public int age;        //OOP관점에서 잘못된 코드
    private String name;   //OOP관점에서 적절한 코드

    public void setName(String n) {
        name = n; //name = n+"님"; 유지보수가 편리해진다.
    }
}

public class OOPBasic {
    public static void main(String[] args) {
        MyStudent m1 = new MyStudent();
        m1.age = 20;
//        m2.name = "김길동님"; 이름 저장의 정책이 바뀔때마다 일일히 모두 수정해야함
        m1.setName("김길동");

        MyStudent m2 = new MyStudent();
        m2.age = 22;
        m2.setName("박길동");

    }
}
