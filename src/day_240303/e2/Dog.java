package day_240303.e2;

public class Dog {
    // state (field属性 variable变量)
    String id;
    String name;
    String color;

    // behavior
    public void show() {
        System.out.println("狗(编号" + id + "编号)的信息：编号=" + id + "、名称=" + name + "、颜色=" + color);
    }
}