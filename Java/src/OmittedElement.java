
//자바에는 3가지 생략 가능한 주요 문법이 존재
//(1) extends Object
//      모든 클래스는 Object 클래스를 상속받고 있다.
//      자바 클래스의 최상위 클래스는 Object class다.

//(2) Default Constructor 생략이 가능
//      개발자가 생성자를 하나도 만들어 주지 않으면 자동으로 디폴트 생성자가 만들어짐

//(3) super();
//      모든 생성자의 첫번째 라인에 생략되어 있음
//      상위 클래스 '디폴트 생성자' 호출을 의미

class SuperA {
    public SuperA(int x) {
        System.out.println( x );
    }
}
class MyA extends SuperA {

    public MyA() {
        super( 3);

    }
}

//class MyA extends SuperA {
//    public MyA() {  //파라미터를 받지 않는 디폴트 생성자 생략 가능
//        super(); //생략 가능
//    }
//}

public class OmittedElement {

    public static void main(String[] args) {

    }
}
