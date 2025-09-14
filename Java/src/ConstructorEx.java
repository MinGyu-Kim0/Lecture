//생성자를 사용하는 가장 큰 목적?

class MyCon {
//    int age;
//    String name;
    private int age;
    private String name;

    //default constructor
    public MyCon() {
        this("김길동", 20);
    }

    public MyCon(int a, String n) { //default 생성자는 아니다
        this(n, a);     //생성자 호출
//        age = a;
//        name = n;
    }

    public MyCon(String n, int a) {
        age = a;
        name = n;
    }

    public int getAge() {
        return age;
    }

    public int setAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class ConstructorEx {
    public static void main(String[] args) {
        MyCon m1 = new MyCon(20, "김길동");//생성자 호출 -> 객체 생성
//        m1.age = 22;


        System.out.println( m1.getName() );

        MyCon m2 = new MyCon(22, "박길동");

        System.out.println( m2.getName() );
    }
}
