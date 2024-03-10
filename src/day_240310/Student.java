package day_240310;

public class Student {
    //state
    String name;
    private static final Student instance = new Student();

    private Student() {

        System.out.println("-------------");
    }
    //behavior
    public static Student getInstance(){
        return instance;
    }
}
