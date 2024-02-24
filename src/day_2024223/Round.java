package day_2024223;

public class Round {
    //state
    double r1;
    double pi=3.14;

    //构造方法
    public Round(double r2) {
        r1=r2;
        System.out.println("自行添加的有参构造");
    }

    //behavior
    public double area(){
        return r1*r1*pi;
    }

}
