public class ArrayEx {
    public static void main(String[] args) {

        //변수 : 변하는 하나의 값을 저장 하기 위한 공간
        int xx = 10;
        //배열 : 변하는 여러개의 값을 저장 하기 위한 공간

        int yy = xx;
        yy = 100;
        System.out.println( xx ); // 10. 기본 자료형은 값이 들어감

        // 자바에서 배열 사용 문법
        //(1) int배열을 가질 수 있는 변수 x를 선언하고 변수에 순서대로 10, 20, 30의 값을 입력
        int[] x = {10,20,30};
        System.out.println( x[0] ); // 10
        System.out.println( x[1] ); // 20
        System.out.println( x[2] ); // 30

        //(2)
        int[] y = x; //x배열이 참조하는 주소 값이 y에 대입된다.
        y[0] = 100; //그렇기 때문에 y 배열의 값을 변경시키면
        System.out.println( x[0] ); //x의 값도 바뀌게 된다. result = 100

        //(3) int값을 가질 수 있는 공간 3개를 만들고 그 위치를 z에 저장
        int[] z = new int[3];
        z[0] = 10;
        z[1] = 20;
        z[2] = 30;
        // z[3] = 40; 값을 가질 수 있는 공간 3개를 만들었고 이를 초과하여 에러 발생

    }
}

