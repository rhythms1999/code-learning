package day_240321.UML;

public class Cylinder extends Circle {
    // 高
    private double length;

    public Cylinder() {
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double findArea() {
        return Math.PI * this.radius * this.radius;
    }

    // 求圆柱的体积
    public double findVolume() {
//        return 3.14 * getRadius() * getRadius() * getLength();
//        return findArea() * getLength();
        return super.findArea() * getLength();
    }
}