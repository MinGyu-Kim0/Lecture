
abstract class Animal {
    abstract public void cry();
}

class Cat extends Animal{
    public void cry() { //상속받은 메소드 기능재정의 -> 메소드 오버라이딩(overriding)
        System.out.println("야옹");
    }
}
class Dog extends Animal {
    public void cry() { //상속받은 추상화메소드 오버라이딩해서 일반메소드로 변경
        System.out.println("멍멍");
    }
}
class pig extends Animal {
//    public void CCC() { //Error -> 상속받은 추상화 클래스의 메소드 사용을 강제한다.
//        System.out.println("꿀꿀");
//    }

     @Override
    public void cry() {
        System.out.println("꿀꿀");
    }
}
public class AbstractEx {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.cry();

        Dog d = new Dog();
        d.cry();

        pig p = new pig();
        p.cry();`




        Animal[] a= new Animal[3];
        a[0] = c; //Animal a = new Cat();
        a[1] = d; //Animal a = new Dog();
        a[2] = p; //Animal a = new Pig();

        a[0].cry(); //Animal a.cry(); -> 야옹
        a[1].cry(); //Animal a.cry(); -> 멍멍
        a[2].cry(); //Animal a.cry(); -> 꿀꿀


    }
}
