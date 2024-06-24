package poly.basic;

//upcasting vs downcasting
public class CastingMain3 {


    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; //업 캐스팅은 생략 가능, 생략 권장
        call(parent1);
        Parent parent2 = child; //업캐스팅 생략
        call(parent2);

        parent1.parentMethod();
        parent2.parentMethod();


    }

    private static void call(Parent parent){
        parent.parentMethod();
        if(parent instanceof Child){
            System.out.println("Child 인스턴스가 맞다");
            Child child = (Child) parent;
            child.childMethod();
        }else {
            System.out.println("Child 인스턴스 아님");

        }
    }
}
