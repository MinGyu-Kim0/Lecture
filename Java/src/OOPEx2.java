
class AAA extends Object {
    public AAA() {
        System.out.println("AAA 생성자");
    }
}
class BBB extends AAA{
    public BBB() {
//        super(); 생략되어 있음.
        System.out.println("BBB 생성자");
    }
}

public class OOPEx2 {
    public static void main(String[] args) {
        BBB b = new BBB(); //AAA 생성자가 먼저 출력된다.

    }
}
