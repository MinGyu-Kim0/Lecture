
//자바에서 메소드 정의 문법
//접근제한자 리턴형 메소드이름( 파라미터 ) { 실제 코드... }

//접근제한자 종류 : public protected default private
//리턴형 종류 : 기본자료형, 객체형, void(리턴형이 없음을 의미)

class CookingRamen {
    //public(접근제한자) void(리턴형) 라면끓여줘(메소드이름)
    public void cook( int money ) { //메소드 정의
        //라면 제작을 위한 프로그래밍
        //...
        System.out.println("라면");
    }
}

public class methodEx {

    public static void main(String[] args) {
        //라면끓여줘 메소드 사용(호출)
        //메소드 호출 : 메소드 이름을 사용하여 호출 가능

        //1. 해당 메소드를 가지고 있는 클래스를 객체화
        CookingRamen call = new CookingRamen();

        //2. 객체이름.메소드이름(파라미터);
        call.cook(1000);



    }
}