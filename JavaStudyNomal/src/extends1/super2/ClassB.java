package extends1.super2;

public class ClassB extends ClassA{

    public ClassB(int a) {
        super(); //기본 생성자 생략 가능 매개변수가 없는 기본생성자는 자바가 자동으로 만들어줌
        System.out.println("ClassB 생성자 = " +a);
    }

    public ClassB(int a, int b) {
        super(); //기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a = "+ a + "b = " +b);
    }

    public ClassB() {
        System.out.println("ClassB 기본 생성자");
    }
}
