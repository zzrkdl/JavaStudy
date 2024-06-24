package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle re = new Rectangle();

        re.width = 5;
        re.height = 5;
        int area = re.calculateArea();
        System.out.println("넓이: " +area);
        int preimeter  = re.calculatePerimeter();
        System.out.println("둘레 길이: " + preimeter);


        boolean isSquare =  re.isSquare();
        System.out.println("정사각형 여부: " + isSquare);
    }
}
