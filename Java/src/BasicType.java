public class BasicType {
    public static void main(String[] args) {
//		자바에서 변수 생성
//		자바에서 변수를 만들때에는 해당 변수가 가질 수 있는 자료를 지정해줘야 한다
//		ex) int x = 0;

//		자바 기본자료형
//		(1) 정수형 ->  byte - short - int - long
        byte b = 10; //1byte 용량 => 2^8 = 256, -128 ~ 127 숫자 저장
        b = -128;
//		b = -129; // 범위초과
        b = 127;
//		b = 128; // 범위초과

        short s = -129; //2byte 용량
        s = 128;

        int i = 99999; //4byte 용량

        long l = 9999999; //8byte 용량

        b = 90;
//		b = b + 10; //산술 연산. 정수형에 산술 연산을 하면
        //무조건 int형으로 인식한다.(암묵적 형변환)
//		short s1 = b - 1; //불가능
        int i1 = b - 1; //가능
//		그렇기 때문에 고민할 필요없이 int타입을 사용하면 된다.
//		자바에 정수형은 암묵적으로 int type으로 변환되기 때문

//		(2) 실수형 -> float - double, default type = double
        float f = 0.1f; //default type이 double이기 때문에
        //float형을 사용하고 싶다면 f를 붙여준다.
        double d = 0.1;

//		(3) 문자형 -> char
//		문자 하나를 저장하기 위해 ''를 사용 "" -> X
        char c = 'A'; // 'A' = 65
        System.out.println(c);
        c = 66; //ascii code값도 입력가능. 66 = B
        System.out.println(c);

        c = 75; // K
        System.out.print(c);
        c = 73; // I
        System.out.print(c);
        c = 77; // M
        System.out.println(c); //KIM 출력

        c = '김';
        System.out.println(c);
        c = 44608; //이건 Unicode값. 한글은 ascii table에 없음.
        System.out.println(c);

//		(4) boolean 형 -> true, false
//		true or false 값만 저장 가능
        boolean boo = true;
        boo = false;
//		boo = 0; //불가능. c, c++ style임.
    }
}