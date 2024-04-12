package day_240321.UML;

public class Circle {
    // 半径
    protected double radius;

    public Circle() {
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // 求圆的面积
    public double findArea() {
        /*
        Math.PI
         */
        return 3.14 * radius * radius;
    }
}
