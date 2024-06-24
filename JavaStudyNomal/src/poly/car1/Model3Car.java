package poly.car1;

public class Model3Car implements Car {
    @Override
    public void startEngine() {
        System.out.println("model 3 car started");
    }

    @Override
    public void offEngine() {
        System.out.println("model 3 car stopped");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("model 3 car pressed accelerator");
    }
}
