// class 구성요소 3가지
// 멤버변수
// 메소드
// 생성자

//자바 프로그램의 모든 코드는 class를 만들고 내부에 작성해야함

class MyClass {
   int x = 10; //멤버 변수
    //멤버 변수 선언 이외의 코드는 전부 메소드 안에 작성
    public void printX() {
        System.out.println( x );
        // y = 200; y변수는 printY()메소드 안에서만 쓸 수 있는 지역변수
   }
   public void printY() {
        x = 100;
       System.out.println( x );
       int y = 20; //지역 변수 : 현재 메소드 안에서만 사용가능
       System.out.println( y );
   }
}

public class OOPEx {

    public static void main(String[] args) {
        //자바 코드를 실행시키면 제일 먼저 실행되는 메소드는 main() 메소드

        //MyClass 클래스를 메모리에 올려준다.(객체화)
        //why CPU는 하드디스크에 접근이 불가능함! CPU가 접근가능한 메모리에 코드를 올려주는 것
        MyClass m = new MyClass(); // new = 메모리에 클래스를 올리는 것.
                                   // 이때 변수 m은 MyClass를 참조한다.(주소 값이 들어감)

        //printX()메소드 실행(호출)
        m.printX(); //m(MyClass)안의 메소드 printX를 호출한것. 10
        m.printY(); // x = 100, y = 20
    }
}
