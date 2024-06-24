package poly.ex4;




public class Cat extends AbstractAnimal {

    @Override
    public void move() {
        System.out.println("고양이가 이동합니다.");
    }

    @Override
    public void sound(){
        System.out.println("야용");
    }

}
