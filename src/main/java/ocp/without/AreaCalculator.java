package ocp.without;

public class AreaCalculator {

    public static double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.getLength() * rectangle.getWidth();
    }

    public static double calculateCircleArea(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

}
