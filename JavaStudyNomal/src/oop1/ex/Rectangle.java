package oop1.ex;

public class Rectangle {
    
    int width = 5;
    int height = 10;
  
    
    int calculatePerimeter(){
        return 2 *  (width + height);
    }
    
    int calculateArea(){
        return width * height;
    }
    
    boolean isSquare(){
       return width == height;
    }
}

