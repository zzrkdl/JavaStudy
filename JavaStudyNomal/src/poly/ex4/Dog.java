package poly.ex4;


public class Dog extends AbstractAnimal {

    @Override
    public void move() {
        System.out.println("강아지가 이동합니다.");
    }

    @Override
    public void sound(){
        System.out.println("멍멍");
    }

}
