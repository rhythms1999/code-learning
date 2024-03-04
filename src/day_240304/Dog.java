package day_240304;

/**
 * 写一个狗Dog类
 * - 3个state：编号id、名称name、颜色color
 * - 1个behavior：show方法（调用show方法之后的输出要求见预期输出）
 * <p>
 * 写一个狗Dog测试类。实例化(new)出两只狗，为其state赋值，同时调用show方法输出两只狗的详细信息
 * <p>
 * 预期输出
 * 狗(编号**)的信息：编号=**、名称=**、颜色=**
 */
public class Dog {
    //state
    String id;
    String name;
    String color;

    //behavior
    void show() {
        System.out.println("狗(编号" + id + ")的信息：编号=" + id + "、名称=" + name + "、颜色=" + color);
    }
}
