package day_240308.thiskeyword;

/**
 * this is a reference to the current object
 * `this 是对当前对象的引用`
 * the object whose method or constructor is being called
 *  `即正在调用其方法或构造函数的对象`
 *
 * You can refer to any member of the current object from within an instance method or a constructor by using this.
 * `可以使用 this 从实例方法或构造函数中引用当前对象的任何成员。`
 *
 * ## Using this with a Constructor
 * From within a constructor, you can also use the this keyword to call another constructor in the same class.
 * `在构造函数中，还可以使用 this 关键字调用同一类中的另一个构造函数。`
 *
 * Doing so is called an explicit constructor invocation.
 * `这样做称为显式构造函数调用。`
 *
 * the invocation of another constructor must be the first line in the constructor.
 * `另一个构造函数的调用必须是构造函数中的第一行。`
 */


public class Student {
    int id;
    String name;
    int age;

    public Student() {
        System.out.println("1");
    }

    public Student(int id) {
        this.id = id;
        System.out.println("2");
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("3");
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println("4");
    }
}