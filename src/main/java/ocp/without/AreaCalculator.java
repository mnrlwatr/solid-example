package ocp.without;

public class AreaCalculator {
    
    public static double calculateArea(Object object) {
        if (object instanceof Rectangle){
            return calculateRectangleArea((Rectangle) object);
        } else if (object instanceof Circle){
            return calculateCircleArea((Circle) object);
        }
        return 0.0;
    }

    private static double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.getLength() * rectangle.getWidth();
    }

    private static double calculateCircleArea(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

}
