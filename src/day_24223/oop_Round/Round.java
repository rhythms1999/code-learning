package day_24223.oop_Round;

public class Round {
    //state
    double r;
    private static double pi = 3.14;

    //构造方法
    public Round(double r) {
        this.r=r;
        System.out.println("自行添加的有参构造");
    }

    //behavior
    public double area(){
        return r*r*pi;
    }

    public double perimeter(){
        return (this.r+r)*2;
    }
}
